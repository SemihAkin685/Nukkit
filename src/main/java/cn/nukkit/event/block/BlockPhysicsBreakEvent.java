package cn.nukkit.event.block;

import cn.nukkit.block.Block;
import cn.nukkit.event.Cancellable;
import cn.nukkit.event.HandlerList;
import lombok.Getter;

/**
 * @author EngincanErgunGG
 */
@Getter
public class BlockPhysicsBreakEvent extends BlockEvent implements Cancellable {

    @Getter
    private static final HandlerList handlers = new HandlerList();

    private final int updateType;

    public BlockPhysicsBreakEvent(Block block, int updateType) {
        super(block);
        this.updateType = updateType;
    }
}