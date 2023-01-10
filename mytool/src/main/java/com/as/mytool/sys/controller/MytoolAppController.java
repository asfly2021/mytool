package com.as.mytool.sys.controller;

import com.as.mytool.common.TResult;
import com.as.mytool.sys.entity.MytoolApp;
import com.as.mytool.sys.service.IMytoolAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 * 工具应用表 前端控制器
 * </p>
 *
 * @author fusheng
 * @since 2023-01-09
 */
@CrossOrigin
@Controller
@RequestMapping("/sys/mytoolApp")
public class MytoolAppController {
    @Autowired
    private IMytoolAppService mytoolAppService;

    @ResponseBody
    @PostMapping("list")
    public TResult selectAllApps() {
        List<MytoolApp> list = mytoolAppService.list();
        return new TResult(0, list);
    }

}
