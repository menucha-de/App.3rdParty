module io.netty.common {
    requires java.logging;
    
    requires transitive jdk.unsupported;

    exports io.netty.util;
    exports io.netty.util.collection;
    exports io.netty.util.concurrent;
    exports io.netty.util.internal;
    exports io.netty.util.internal.logging;
    exports io.netty.util.internal.shaded.org.jctools.queues;
    exports io.netty.util.internal.shaded.org.jctools.queues.atomic;
    exports io.netty.util.internal.shaded.org.jctools.util;

}
