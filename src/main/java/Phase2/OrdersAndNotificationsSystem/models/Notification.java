package Phase2.OrdersAndNotificationsSystem.models;

import Phase2.OrdersAndNotificationsSystem.models.order.Order;
import Phase2.OrdersAndNotificationsSystem.services.notifications.MessageChannel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class Notification {
    String content;
    int id;
    Order order;

    MessageChannel messageChannel;

    @JsonIgnore
    static int count = 0;

    public Notification(String msg, Order order) {
        this.content = msg;
        this.order = order;
        id = ++count;
    }
}
