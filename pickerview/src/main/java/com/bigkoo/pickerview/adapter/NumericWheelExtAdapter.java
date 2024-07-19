package com.bigkoo.pickerview.adapter;


import com.contrarywind.adapter.WheelAdapter;

/**
 * Numeric Wheel adapter.
 */
public class NumericWheelExtAdapter implements WheelAdapter {

    private int minValue;
    private int maxValue;
    private boolean showLong;

    /**
     * Constructor
     *
     * @param minValue the wheel min value
     * @param maxValue the wheel max value
     */
    public NumericWheelExtAdapter(int minValue, int maxValue, boolean showLong) {
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.showLong = showLong;
    }

    @Override
    public Object getItem(int index) {
        if (index >= 0 && index < getItemsCount()) {
            if (showLong && index == getItemsCount() - 1) {
                return "长期";
            } else {
                int value = minValue + index;
                return value;
            }
        }
        return 0;
    }

    @Override
    public int getItemsCount() {
        return maxValue - minValue + 1;
    }

    @Override
    public int indexOf(Object o) {
        try {
            return (int) o - minValue;
        } catch (Exception e) {
            return -1;
        }

    }

}
