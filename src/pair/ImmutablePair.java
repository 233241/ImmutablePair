package pair;

/**
 * Created by m on 07.04.16.
 * xyz
 */
public final class ImmutablePair<T1, T2> {
    public final T1 x;
    public final T2 y;

    public ImmutablePair(T1 x, T2 y) {
        this.x = x;
        this.y = y;
    }
}
