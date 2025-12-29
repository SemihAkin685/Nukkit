package cn.nukkit.network.protocol;

import cn.nukkit.network.protocol.types.ModalFormCancelReason;
import lombok.ToString;

@ToString
public class ModalFormResponsePacket extends DataPacket {

    public static final byte NETWORK_ID = ProtocolInfo.MODAL_FORM_RESPONSE_PACKET;

    public int formId;
    public String data = "null";
    public ModalFormCancelReason cancelReason;

    @Override
    public byte pid() {
        return NETWORK_ID;
    }

    @Override
    public void decode() {
        this.formId = this.getVarInt();
        if (this.getBoolean()) {
            this.data = this.getString();
        }
        if (this.getBoolean()) {
            this.cancelReason = ModalFormCancelReason.values()[this.getByte()];
        }
    }

    @Override
    public void encode() {
        this.encodeUnsupported();
    }
}
