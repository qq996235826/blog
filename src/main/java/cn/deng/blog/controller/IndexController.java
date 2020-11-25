package cn.deng.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author deng
 * @version 1.0
 * @description 主页控制
 * @date 2020/11/26 2:16
 */
@Controller
public class IndexController {
    /**
     * 创建方法,用于索引
     * @return "index"
     */
    @GetMapping("/")//一个反斜杠代表你啥都不输入的时候默认来这里
    public String index()    //获得搜索框的内容,required=false表示该参数不是必要的
    {
        return "index";
    }
}
