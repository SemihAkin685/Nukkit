package cn.nukkit.event.player;

import cn.nukkit.Player;
import cn.nukkit.event.Cancellable;
import cn.nukkit.event.HandlerList;
import cn.nukkit.form.response.Response;
import cn.nukkit.form.window.Form;
import lombok.Getter;

@Getter
public class PlayerSettingsRespondedEvent extends PlayerEvent implements Cancellable {

    @Getter
    private static final HandlerList handlers = new HandlerList();

    protected int formID;
    protected Form<?> window;
    /**
     * -- GETTER --
     *  Can be null if player closed the window instead of submitting it
     *
     */
    protected Response response;

    public PlayerSettingsRespondedEvent(Player player, int formID, Form<?> window, Response response) {
        this.player = player;
        this.formID = formID;
        this.window = window;
        this.response = response;
    }

    @Override
    public void setCancelled() {
        super.setCancelled();
    }

}