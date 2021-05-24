package com.bjpowernode.javase.string;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/13 22:36
 * Description:
 */


class StringTest05 {
    /**
     * @param args
     */
    public static void main(String[] args) {

        // String类当中的常用方法。
        // 1、（掌握）char charAt(int index)
        char c = "中国人".charAt(1); //"中国人"是一个字符串String对象。只要是对象就能"点."
        System.out.println(c); //国

        //2、（了解）int  compareTo(String anotherString)
        // 字符串之间比较大小不能直接使用> < ,需要使用compareTo方法。
        int result ="abc".compareTo("abc");
        System.out.println(result); // 0(等于0) 前后一致 10 - 10 =0

        int result2 = "abcd".compareTo("abce");
        System.out.println(result2); // -1(小于0) 前小后大 8 - 9 = -1

        int result3 = "abce".compareTo("abcf");
        System.out.println(result3); // 1(大于0) 前大后小 9 - 8 = 1

        // 拿着字符串第一个字母和后面字符串的第一个字母比较。能分胜负就不比较了。
        System.out.println("xyz".compareTo("yxz")); //-1

        System.out.println("----------------------------------------------------------");

        //3、（掌握）boolean contains(CharSequence s)
        // 判断前面的字符串是否包含后面的子字符串。
        System.out.println("HelloWorld.java".contains(".java")); // true
        System.out.println("http://www.baidu.com".contains("https://")); // false

        //4、（掌握）boolean endsWith(String suffix)
        // 判断当前字符串是否以某个子字符串结尾。
        System.out.println("test.txt".endsWith(".java")); // false
        System.out.println("test.txt".endsWith(".txt")); // true

        System.out.println("fasdfasfkasjglfkajslgjfasjg".endsWith("jg")); // true

        //5、（掌握）boolean equals(Object anObject)"
        // 比较两个字符串必须使用equals方法，不能使用"=="
        // equals方法有没有调用compareTo方法？老版本可以看一下。JDK15中没有调用compareTo()方法。
        // equals只能看出来相等与否
        // compareTo方法可以看出是否相等，并且同时还可以看出谁大谁小。
        System.out.println("abc".equals("abc"));

        //6、（掌握）boolean equalsIgnoreCase(String anotherString)
        // 判断两个字符串是否相等，并且同时忽略大小写。
        System.out.println("ABc".equalsIgnoreCase("abc")); // true

        //7、（掌握）byte[] getBytes()
        // 将字符串对象转换成字节数组
        byte[] bytes = "abcdef".getBytes();
        for(int i=0;i<bytes.length;i++){
            System.out.println(bytes[i]);
        }

        //8、（掌握）int indexOf(String str)
        // 判断某个子字符串在当前字符串中第一次出现处的索引(下标)。
        System.out.println("oraclejavac++.netc#phppythonjavaoraclec++".indexOf("java")); // 6

        //9、（掌握）boolean isEmpty()
        // 判断某个字符串是否为"空字符串"。底层源代码调用的应该是字符串的length()方法。
        String s="";
        String s2="abc";
        System.out.println(s.isEmpty()); //true
        System.out.println(s2.isEmpty()); //false

        //10、（掌握）int length();
        // 面试题：判断数组长度和判断字符串长度不一样
        // 判断数组长度是length属性，判断字符串长度是length()方法。
        System.out.println("abc".length()); // 这里的abc是一个String对象，length()是String里的方法

        System.out.println("".length()); // 0

        //11、（掌握）int lastIndexOf(String str)
        // 判断某个字符串在当前字符串中最后一次出现的索引（下标）
        System.out.println("oraclejavac++javac#phpjavapython".lastIndexOf("java")); //22

        //12、（掌握）String replace(CharSequence target, CharSequence replacement)
        // 替换。
        // String的父接口就是：CharSequence
        String newString = "http://www.baidu.com".replace("http://","https://");
        System.out.println(newString); //https://www.baidu.com
        //把以下字符串中的"="替换成"："
        String newString2 = "name=zhangsan&password=123&age=20".replace("=",":");
        System.out.println(newString2);

        //13、（掌握）String[] split(String regex)
        // 拆分字符串
        String[] ymd ="1980-10-11".split("-"); //"1980-10-11"以"-"分隔符进行拆分。
        for(int i=0;i<ymd.length;i++){
            System.out.println(ymd[i]);
        }
        String param = "name=zhangsan&password=123&age=20";
        String[]params = param.split("&");
        for(int i=0;i<params.length;i++){
            System.out.println(params[i]);
            // 可以继续向下拆分，可以通过"="拆分。
            String[] paramsS = params[i].split("=");
            for(int j=0;j<paramsS.length;j++){
                System.out.println(paramsS[j]);
            }
        }

        //14、（掌握）boolean startsWith(String prefix)
        // 判断某个字符串是否以某个子字符串开始。
        System.out.println("http://www.baidu.com".startsWith("http://")); //true
        System.out.println("http://www.baidu.com".startsWith("https://")); //false

        //15、（掌握）String substring(int beginIndex) 参数是起始下标。
        // 截取字符串
        System.out.println("https://www.bing.com".substring(7));// /www.bing.com

        //16、（掌握）String substring(int beginIndex, int endIndex)
        // beginIndex起始位置（包括）
        // endIndex结束位置（不包括）
         System.out.println("https://www.bing.com".substring(12,16)); //bing

        //17、（掌握）char[] toCharArray()
        // 将字符串转换成char数组
        char [] chars = "我是中国人".toCharArray();
        for(int i = 0;i<chars.length;i++){
            System.out.println(chars[i]);
        }

        //18、（掌握）String toLowerCase()
        // 转换成小写
        System.out.println("ABCDefAFJAJFdaf".toLowerCase());

        //19、（掌握）String toUpperCase()
        System.out.println("afasfsasfaAJFJAFJ".toUpperCase());

        //20、（掌握）String trim()
        // 去除字符串前后空白
        System.out.println("        hello   world         ".trim());

        //21、（掌握）String中只有一个方法是静态的，不需要new对象
        // 这个方法叫做valueOf
        // 作用：将"非字符串"转换成"字符串"
        //String s1 = String.valueOf(true);
        //String s1 = String.valueOf(100);
        //String s1 = String.valueOf(3.14);

        // 这个静态的valueOf()方法，参数是一个对象的时候，会自动调用对象的toString()方法吗？
        String s1 = String.valueOf(new Customer());
        //System.out.println(s1); // 没有重写toString方法，所以调用的是Object中的默认的toString()方法，会输出其内存地址！
        System.out.println(s1);

        // 我们是不是可以研究一下println()方法的源代码？
        System.out.println(100);
        System.out.println(3.14);
        System.out.println(true);

        // 通过源代码可以看出：为什么输出一个引用的时候，会调用toString()方法！！！
        System.out.println(new Object());
        // 本质上System.out.println()这个方法在输出任何数据的时候，都是转换成字符串再输出！！
        // 能够打印到控制台上的都是字符串！凡是能够打印出来的都是转换成字符串之后的结果

        System.out.println(new Customer());
    }
}

class Customer{
    // 重写toString()方法

    @Override
    public String toString() {
        return "我是一个VIP客户！！！！";
    }
}
