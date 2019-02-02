package jp.co.ha.common.function;

import java.util.List;

/**
 * 指定したリストに対して要素を一つ返す関数インターフェース
 *
 * @param <T>
 */
@FunctionalInterface
public interface ListOperator<T> {

	/**
	 * 指定したリストに対して要素を一つ返す関数
	 *
	 * @param list
	 *     対象のリスト
	 * @return 要素
	 */
	T get(List<T> list);
}
