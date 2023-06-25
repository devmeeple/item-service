package hello.itemservice.domain.item;

import lombok.Data;

// @Data 를 사용 할 때 조심해야한다. 목적성을 확실하게 가지고 사용하자.  학습 예제라서 @Data 사용
@Data
public class Item {

    private Long id;
    private String itemName;
    private Integer price; // 값이 안 들어갔을 때도(null) 가정해서 int 형이 아닌 Integer 선언
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
