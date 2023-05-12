package celilcavus.Interfaces;

import java.util.List;

public interface GenericRepository<T> {
	
	void Add(T item);
	void Update(T item);
	void Delete(T item);
	List<T> GetAll();
	T GetById(int id);
}
