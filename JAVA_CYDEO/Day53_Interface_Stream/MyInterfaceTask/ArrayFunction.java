package Day53_Interface_Stream.MyInterfaceTask;


@FunctionalInterface
public interface ArrayFunction<T, R> {


    R apply(T[] t);
}
