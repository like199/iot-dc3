/*
 * Copyright 2019 Pnoker. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.pnoker.transfer.rtmp.api;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pnoker.api.transfer.rtmp.feign.RtmpTransferFeignClient;
import com.pnoker.common.bean.Response;
import com.pnoker.common.constant.Common;
import com.pnoker.common.dto.transfer.RtmpDto;
import com.pnoker.common.entity.rtmp.Rtmp;
import com.pnoker.transfer.rtmp.service.RtmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>Rest接口控制器
 *
 * @author : pnoker
 * @email : pnokers@icloud.com
 */
@Slf4j
@RestController
@RequestMapping(Common.Service.DC3_RTMP_URL_PREFIX)
public class RtmpTransferApi implements RtmpTransferFeignClient {
    @Resource
    private RtmpService rtmpService;

    @Override
    public Response<Rtmp> add(Rtmp rtmp) {
        return rtmpService.add(rtmp);
    }

    @Override
    public Response<Boolean> delete(Long id) {
        return rtmpService.delete(id);
    }

    @Override
    public Response<Rtmp> update(Rtmp rtmp) {
        return rtmpService.update(rtmp);
    }

    @Override
    public Response<Rtmp> selectById(Long id) {
        return rtmpService.selectById(id);
    }

    @Override
    public Response<Page<Rtmp>> list(RtmpDto rtmpDto) {
        return rtmpService.list(rtmpDto);
    }

    @Override
    public Response<Boolean> start(Long id) {
        return rtmpService.start(id);
    }

    @Override
    public Response<Boolean> stop(Long id) {
        return rtmpService.stop(id);
    }

}
