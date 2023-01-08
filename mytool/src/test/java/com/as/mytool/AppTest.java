package com.as.mytool;

import com.as.mytool.common.TResult;
import com.as.mytool.sys.controller.MytoolAppController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Unit test for simple App.
 */
@SpringBootTest
public class AppTest {

    @Autowired
    private MytoolAppController mytoolAppController;

    @Test
    public void test1() {
        TResult tResult = mytoolAppController.selectAllApps();
        System.out.println(tResult);
    }
}
