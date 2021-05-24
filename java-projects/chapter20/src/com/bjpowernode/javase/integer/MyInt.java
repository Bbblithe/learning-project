package com.bjpowernode.javase.integer;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/17 20:23
 * Description:
 * 这种包装类目前是我们自己写的，实际开发当中我们不需要自己写。
 * 8种基本数据类型的对应的8种包装类，SUN公司已经写好了。我们直接用。
 */


class MyInt {
    int value;

    public MyInt() {
    }

    public MyInt(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
