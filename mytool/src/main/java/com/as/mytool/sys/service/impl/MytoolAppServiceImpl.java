package com.as.mytool.sys.service.impl;

import com.as.mytool.sys.entity.MytoolApp;
import com.as.mytool.sys.mapper.MytoolAppMapper;
import com.as.mytool.sys.service.IMytoolAppService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 工具应用表 服务实现类
 * </p>
 *
 * @author fusheng
 * @since 2023-01-08
 */
@Service("mytoolAppService")
public class MytoolAppServiceImpl extends ServiceImpl<MytoolAppMapper, MytoolApp> implements IMytoolAppService {

}
