package toystore.dao;

import toystore.model.products.Product;

import java.util.List;

public interface WarehouseDao {
    List<Product> listProducts(long storageRoomId);
    int getCount(long storageRoomId, long productId);

    /**
     * @return the number of stored products, {@code count} if success
     */
    int putInto(long storageRoomId, long productId, int count);

    /**
     * @return the number of items actually removed
     */
    int getFrom(long storageRoomId, long productId, int count);

    default int move(long fromRoom, long toRoom, long productId, int count) {
        int gotCount = getFrom(fromRoom, productId, count);
        return putInto(toRoom, productId, gotCount);
    }
}
