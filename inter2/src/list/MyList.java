package list;

public interface MyList<E> {
	int size();
	void add(E e);
	void add(int index, E e);
	E get(int index);
	E set(int index, E e);
	E remove(int index);
	int indexOf(E e);
}
