package inheritancemethods.products;

import java.math.BigDecimal;

public class PackedProduct extends Product {

    private int packingUnit;
    private BigDecimal weightOfBox;

    public PackedProduct(String name, BigDecimal unitWeight, int numberOfDecimals, int packingUnit, BigDecimal weightOfBox) {
        super(name, unitWeight, numberOfDecimals);
        this.packingUnit = packingUnit;
        this.weightOfBox = weightOfBox;
    }

    @Override
    public BigDecimal totalWeight(int pieces) {
        int remainingPieces = pieces % packingUnit == 0 ? 0 : 1;
        BigDecimal numberOfBoxes = new BigDecimal ((pieces / packingUnit)).add(new BigDecimal(remainingPieces));
        return super.totalWeight(pieces).add(numberOfBoxes.multiply(weightOfBox));
    }

    public int getPackingUnit() {
        return packingUnit;
    }

    public BigDecimal getWeightOfBox() {
        return weightOfBox;
    }
}
