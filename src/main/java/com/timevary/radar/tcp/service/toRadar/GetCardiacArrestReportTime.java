package com.timevary.radar.tcp.service.toRadar;

import com.timevary.radar.tcp.hander.base.AbstractToRadarProtocolDataHandler;
import com.timevary.radar.tcp.protocol.FunctionEnum;
import io.netty.buffer.ByteBuf;
import org.springframework.stereotype.Service;

/**
 * @author ：ywb
 * @date ：Created in 2022/1/8 17:55
 * @modified By：
 * 获取心率骤停报警时间
 */
@Service
public class GetCardiacArrestReportTime extends AbstractToRadarProtocolDataHandler {

    public Integer process(String radarId) throws Exception {
        ByteBuf byteBuf = super.processDo(radarId, FunctionEnum.getCardiacArrestReportTime);
        int readInt = byteBuf.readInt();
        byteBuf.release();
        return readInt;
    }

}
