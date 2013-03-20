/**
 * @author SERKAN OZAL
 *         
 *         E-Mail: <a href="mailto:serkanozal86@hotmail.com">serkanozal86@hotmail.com</a>
 *         GitHub: <a>https://github.com/serkan-ozal</a>
 */

package tr.com.serkanozal.jillegal.pool;

import tr.com.serkanozal.jillegal.domain.model.pool.OffHeapPoolCreateParameter;

public interface RandomAccessOffHeapPool<T, P extends OffHeapPoolCreateParameter<T>> extends OffHeapPool<T, P> {

	T getObject(long index);
	
}
