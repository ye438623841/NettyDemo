package com.NettyDemo.demo08.codec;

import com.NettyDemo.demo08.command.Packet;
import com.NettyDemo.demo08.command.PacketCodeC;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * @Author: ZiJie.Yip
 * @Description:服务端编码
 * @date: 2018/10/10 14:45
 */
public class PacketEncoder extends MessageToByteEncoder<Packet> {
    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, Packet packet, ByteBuf byteBuf) throws Exception {
        PacketCodeC.INSTANCE.encode(byteBuf,packet);
    }
}
