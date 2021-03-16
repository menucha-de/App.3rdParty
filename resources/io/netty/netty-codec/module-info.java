module io.netty.codec {
    requires transitive io.netty.buffer;
    requires transitive io.netty.common;
    requires transitive io.netty.transport;

    exports io.netty.handler.codec;
    exports io.netty.handler.codec.base64;
    exports io.netty.handler.codec.bytes;
    exports io.netty.handler.codec.compression;
    exports io.netty.handler.codec.json;
    exports io.netty.handler.codec.serialization;
    exports io.netty.handler.codec.string;
    exports io.netty.handler.codec.xml;

}
