package com.cn.Face.compile;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Count {

    //该方法最终会将输入的待计算式子转化为后缀表达式存储在clip_1对象中并将其返回
    public Clip pushCount(String pushCount){
        Clip clip_1 = new Clip();
        Clip clip_2 = new Clip();
        char[] chars = pushCount.toCharArray();
        if (!checkoutBracket(chars)) {
            clip_1.setFlag(false);
            return clip_1;
        }else {
            for (char a : chars) {
                switch (a) {
                    case '(':
                        //如果扫描过程中遇到‘(’，直接入clip_1即可
                        clip_2.push(a);
                        break;
                    //如果遇到‘)’，判断此时的栈顶元素是否为操作符，是，直接弹出
                    case ')':
                        topIsBracket(clip_2);
                        clip_1.push(clip_2.pop());
                        topIsBracket(clip_2);
                        break;
                    //如果遇到操作符调用isOperator()对其进行进一步操作
                    case '+':
                    case '-':
                    case 'x':
                    case '/':
                        //处理入栈；
                        isOperator(clip_1, clip_2, a);
                        break;
                    default:
                        //数字和小数点直接入clip_1
                        clip_1.push(a);
                }
            }
            while (clip_2.getTop() != -1) {
                char pop = clip_2.pop();
                if (pop != '(') clip_1.push(pop);
            }
            clip_1.push('#');
            return clip_1;
        }
    }

    public void isOperator(Clip clip_1,Clip clip_2,char a){
        //如果传入操作符的优先级大于此时clip_2的栈顶元素
        if (clip_2.getTop() == -1||clip_2.peekThisTop() == '(' || priority(a) > priority(clip_2.peekThisTop())){
            clip_1.push('_');
            clip_2.push(a);
        }else {
            //如果传入操作符的优先级小于此时clip_2的栈顶元素
            clip_1.push(clip_2.pop());
            clip_2.push(a);
        }
    }

    //设置并返回传入操作符的优先级
    public int priority(char a){
        int i = 0;
        switch (a){
            case '+':
            case '-':
                break;
            case 'x':
            case '/':
                i = 1;
        }
        return i;
    }

    //如果clip此时的栈顶元素是‘(’，该方法会将其直接弹出
    public void topIsBracket(Clip clip){
        if (clip.peekThisTop() == '(') clip.pop();
    }

    //该方法用于对转换得到的后缀表达式求值
    public List<String> countFormula(Clip clip){
        double sum = 0.0;
        List<String> classify = classify(clip.getClip());
        for(int i = 0;i < classify.size();i++){
            switch (bracketIndex(classify.get(i).charAt(0))){
                case 0:
                    sum = Double.parseDouble(classify.get(i-2)) + Double.parseDouble(classify.get(i-1));
                    classify.remove(i-2);
                    classify.remove(i-2);
                    classify.remove(i-2);
                    classify.add(i-2,String.valueOf(sum));
                    i = 0;
                    break;
                case 1:
                    sum = Double.parseDouble(classify.get(i-2)) - Double.parseDouble(classify.get(i-1));
                    classify.remove(i-2);
                    classify.remove(i-2);
                    classify.remove(i-2);
                    classify.add(i-2,String.valueOf(sum));
                    i = 0;
                    break;
                case 2:
                    sum = Double.parseDouble(classify.get(i-2)) * Double.parseDouble(classify.get(i-1));
                    classify.remove(i-2);
                    classify.remove(i-2);
                    classify.remove(i-2);
                    classify.add(i-2,String.valueOf(sum));
                    i = 0;
                    break;
                case 3:
                    sum = Double.parseDouble(classify.get(i-2)) / Double.parseDouble(classify.get(i-1));
                    /*
                     * 格式化计算结果
                     */
                    DecimalFormat decimalFormat = new DecimalFormat("0.0000000");
                    String format = decimalFormat.format(sum);

                    classify.remove(i-2);
                    classify.remove(i-2);
                    classify.remove(i-2);
                    classify.add(i-2,format);

                    i = 0;
                    break;
            }
        }
        return classify;
    }

    /*试想一下如果我们要计算123x4
     *	1.经过前面的操作后式子变成这样char c[] = {'1','2','3','4','x'}
     *	2.经过该方法的处理它会变成这样["123","4","x"]
     */
    public List<String> classify(char c[]){
        List<String> list = new ArrayList<String>();
        String out = "";
        for (char a : c){
            if (a == '#') break;
            if (judgeIsBracket(a)) {
                if (out != "")list.add(out);
                list.add(String.valueOf(a));
                out = "";
            }
            else if(a == '_') {
                list.add(out);
                out = "";
            }
            else out = out + a;
        }
        return list;
    }

    //判断传入的字符是否为操作符
    public boolean judgeIsBracket(char a){
        switch (a){
            case '+':
            case '-':
            case 'x':
            case '/':
                return true;
            default:return false;
        }
    }

    //求值操作会根据该方法的返回值而知晓应该为当前的两个数字施加何种运算
    public int bracketIndex(char a){
        int i = 0;
        switch (a){
            case '+': i = 0;break;
            case '-': i = 1;break;
            case 'x': i = 2;break;
            case '/': i = 3;break;
            default: i = -1;
        }
        return i;
    }

    //该方法用于判断用户输入式子中的括号是否成对
    public boolean checkoutBracket (char c[]){
        int i = 0;
        int j = 0;
        for (char a : c){
            if (a == '(') i++;
            if (a == ')') j++;
        }
        boolean b = i == j ? true : false;
        return b;
    }
}

