package mooc.vandy.java4android.calculator.logic;

import androidx.annotation.NonNull;

/**
 * Perform the Add operation.
 */
public class Add {
    private final int mArgumentOne;
    private final int mArgumentTwo;

    public Add(int argumentOne, int argumentTwo) {
        mArgumentOne = argumentOne;
        mArgumentTwo = argumentTwo;
    }

    @NonNull
    public String toString() {
        return String.valueOf(mArgumentOne + mArgumentTwo);
    }
}