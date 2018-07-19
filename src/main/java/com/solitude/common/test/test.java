package com.solitude.common.test;

import com.solitude.common.utils.HttpClientUtil;

public class test {
    public static void main(String[] args) {
        String url="http://api.map.baidu.com/telematics/v3/weather?location=" + "成都" +
                "&output=json&ak=q8EYIGYV4OggxxMbZQfQiU0GIwtgon6m";
        String result=HttpClientUtil.resultByGet(url);
        System.err.println("result:"+result);
    }
}
