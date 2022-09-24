package Day53_Interface_Stream.MyInterfaceTask;

import java.util.List;

@FunctionalInterface
public interface ListFunction<T, R> {

    R apply(List<T> t); //коли в мейні вставляєш то не пиши лист а просто то шо всередині лсита хочеш


}
