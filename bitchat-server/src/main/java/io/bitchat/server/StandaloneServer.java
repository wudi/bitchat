package io.bitchat.server;

import io.bitchat.core.packet.PacketRecognizer;
import io.bitchat.core.serialize.SerializerChooser;
import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * A standalone server
 * </p>
 *
 * @author houyi
 */
@Slf4j
public class StandaloneServer extends AbstractServer {

    public StandaloneServer(Integer serverPort) {
        super(serverPort);
    }

    public StandaloneServer(Integer serverPort, SerializerChooser chooser, PacketRecognizer recognizer, ChannelListener channelListener) {
        super(serverPort, chooser, recognizer, channelListener);
    }

    @Override
    public void registerToRouter() {
        // do nothing
    }

}
