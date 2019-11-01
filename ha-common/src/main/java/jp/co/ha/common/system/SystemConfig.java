package jp.co.ha.common.system;

import org.springframework.stereotype.Component;

/**
 * system.propertiesのBean
 * 
 * @since 1.0
 */
@Component
public class SystemConfig {

	/** ページング数 */
	private String paging;

	/**
	 * pagingを返す
	 *
	 * @return paging
	 */
	public String getPaging() {
		return paging;
	}

	/**
	 * pagingを設定する
	 *
	 * @param paging
	 *     ページング数
	 */
	public void setPaging(String paging) {
		this.paging = paging;
	}

}
