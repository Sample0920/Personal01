/* Code Generator Information.
 * generator Version 1.0.0 release 2007/10/10
 * generated Date Mon Aug 18 14:52:22 JST 2014
 */
import java.io.Serializable;

/**
 * Ft_worktimeVo.
 * @author cypher256
 * @version 1.0 
 * history 
 * Symbol	Date		Person		Note
 * [1]		2014/08/18	cypher256		Generated.
 */
public class Ft_worktimeVo implements Serializable{

	public static final String TABLE = "FT_WORKTIME";

	/**
	 * データ種別:varchar2(30)
	 */
	private String データ種別;

	/**
	 * 月度:varchar2(6) <Primary Key>
	 */
	private String 月度;

	/**
	 * 締日区分:varchar2(20) <Primary Key>
	 */
	private String 締日区分;

	/**
	 * 担当本部コード:varchar2(3)
	 */
	private String 担当本部コード;

	/**
	 * 担当事業部コード:varchar2(3)
	 */
	private String 担当事業部コード;

	/**
	 * 担当部コード:varchar2(3)
	 */
	private String 担当部コード;

	/**
	 * 担当グループコード:varchar2(3)
	 */
	private String 担当グループコード;

	/**
	 * 担当本部名:varchar2(50)
	 */
	private String 担当本部名;

	/**
	 * 担当事業部名:varchar2(50)
	 */
	private String 担当事業部名;

	/**
	 * 担当部名:varchar2(50)
	 */
	private String 担当部名;

	/**
	 * 担当グループ名:varchar2(50)
	 */
	private String 担当グループ名;

	/**
	 * オーダ識別区分:varchar2(1) <Primary Key>
	 */
	private String オーダ識別区分;

	/**
	 * 受注番号:varchar2(10) <Primary Key>
	 */
	private String 受注番号;

	/**
	 * 受注明細番号:varchar2(3) <Primary Key>
	 */
	private String 受注明細番号;

	/**
	 * 受注明細枝番:varchar2(3) <Primary Key>
	 */
	private String 受注明細枝番;

	/**
	 * 得意先コード:varchar2(10)
	 */
	private String 得意先コード;

	/**
	 * 得意先名:varchar2(50)
	 */
	private String 得意先名;

	/**
	 * ユーザコード:varchar2(10)
	 */
	private String ユーザコード;

	/**
	 * ユーザ名:varchar2(50)
	 */
	private String ユーザ名;

	/**
	 * 件名:varchar2(120)
	 */
	private String 件名;

	/**
	 * 商品名:varchar2(30)
	 */
	private String 商品名;

	/**
	 * 本部コード:varchar2(3)
	 */
	private String 本部コード;

	/**
	 * 事業部コード:varchar2(3)
	 */
	private String 事業部コード;

	/**
	 * 部コード:varchar2(3)
	 */
	private String 部コード;

	/**
	 * グループコード:varchar2(3)
	 */
	private String グループコード;

	/**
	 * 本部名:varchar2(50)
	 */
	private String 本部名;

	/**
	 * 事業部名:varchar2(50)
	 */
	private String 事業部名;

	/**
	 * 部名:varchar2(50)
	 */
	private String 部名;

	/**
	 * グループ名:varchar2(50)
	 */
	private String グループ名;

	/**
	 * 作業者コード:varchar2(10) <Primary Key>
	 */
	private String 作業者コード;

	/**
	 * 作業者名:varchar2(50)
	 */
	private String 作業者名;

	/**
	 * 役職コード:varchar2(3)
	 */
	private String 役職コード;

	/**
	 * 役職名:varchar2(30)
	 */
	private String 役職名;

	/**
	 * スピリットフラグ:varchar2(3)
	 */
	private String スピリットフラグ;

	/**
	 * 作業区分:varchar2(5)
	 */
	private String 作業区分;

	/**
	 * キャリア名:varchar2(20)
	 */
	private String キャリア名;

	/**
	 * エキスパート区分:varchar2(5)
	 */
	private String エキスパート区分;

	/**
	 * 二十日迄工数:number(4,1)
	 */
	private java.math.BigDecimal 二十日迄工数;

	/**
	 * 二十日以降工数:number(4,1)
	 */
	private java.math.BigDecimal 二十日以降工数;

	/**
	 * 月度計工数:number(4,1)
	 */
	private java.math.BigDecimal 月度計工数;

	/**
	 * 原価対象旅費:number(8,1)
	 */
	private java.math.BigDecimal 原価対象旅費;

	/**
	* Constractor
	*/
	public Ft_worktimeVo(){}

	/**
	* Constractor
	* @param <code>月度</code>
	* @param <code>締日区分</code>
	* @param <code>オーダ識別区分</code>
	* @param <code>受注番号</code>
	* @param <code>受注明細番号</code>
	* @param <code>受注明細枝番</code>
	* @param <code>作業者コード</code>
	*/
	public Ft_worktimeVo(String 月度, String 締日区分, String オーダ識別区分, String 受注番号, String 受注明細番号, String 受注明細枝番, String 作業者コード){
		this.月度 = 月度;
		this.締日区分 = 締日区分;
		this.オーダ識別区分 = オーダ識別区分;
		this.受注番号 = 受注番号;
		this.受注明細番号 = 受注明細番号;
		this.受注明細枝番 = 受注明細枝番;
		this.作業者コード = 作業者コード;
	}

	public String getデータ種別(){ return this.データ種別; }

	public void setデータ種別(String データ種別){ this.データ種別 = データ種別; }

	public String get月度(){ return this.月度; }

	public void set月度(String 月度){ this.月度 = 月度; }

	public String get締日区分(){ return this.締日区分; }

	public void set締日区分(String 締日区分){ this.締日区分 = 締日区分; }

	public String get担当本部コード(){ return this.担当本部コード; }

	public void set担当本部コード(String 担当本部コード){ this.担当本部コード = 担当本部コード; }

	public String get担当事業部コード(){ return this.担当事業部コード; }

	public void set担当事業部コード(String 担当事業部コード){ this.担当事業部コード = 担当事業部コード; }

	public String get担当部コード(){ return this.担当部コード; }

	public void set担当部コード(String 担当部コード){ this.担当部コード = 担当部コード; }

	public String get担当グループコード(){ return this.担当グループコード; }

	public void set担当グループコード(String 担当グループコード){ this.担当グループコード = 担当グループコード; }

	public String get担当本部名(){ return this.担当本部名; }

	public void set担当本部名(String 担当本部名){ this.担当本部名 = 担当本部名; }

	public String get担当事業部名(){ return this.担当事業部名; }

	public void set担当事業部名(String 担当事業部名){ this.担当事業部名 = 担当事業部名; }

	public String get担当部名(){ return this.担当部名; }

	public void set担当部名(String 担当部名){ this.担当部名 = 担当部名; }

	public String get担当グループ名(){ return this.担当グループ名; }

	public void set担当グループ名(String 担当グループ名){ this.担当グループ名 = 担当グループ名; }

	public String getオーダ識別区分(){ return this.オーダ識別区分; }

	public void setオーダ識別区分(String オーダ識別区分){ this.オーダ識別区分 = オーダ識別区分; }

	public String get受注番号(){ return this.受注番号; }

	public void set受注番号(String 受注番号){ this.受注番号 = 受注番号; }

	public String get受注明細番号(){ return this.受注明細番号; }

	public void set受注明細番号(String 受注明細番号){ this.受注明細番号 = 受注明細番号; }

	public String get受注明細枝番(){ return this.受注明細枝番; }

	public void set受注明細枝番(String 受注明細枝番){ this.受注明細枝番 = 受注明細枝番; }

	public String get得意先コード(){ return this.得意先コード; }

	public void set得意先コード(String 得意先コード){ this.得意先コード = 得意先コード; }

	public String get得意先名(){ return this.得意先名; }

	public void set得意先名(String 得意先名){ this.得意先名 = 得意先名; }

	public String getユーザコード(){ return this.ユーザコード; }

	public void setユーザコード(String ユーザコード){ this.ユーザコード = ユーザコード; }

	public String getユーザ名(){ return this.ユーザ名; }

	public void setユーザ名(String ユーザ名){ this.ユーザ名 = ユーザ名; }

	public String get件名(){ return this.件名; }

	public void set件名(String 件名){ this.件名 = 件名; }

	public String get商品名(){ return this.商品名; }

	public void set商品名(String 商品名){ this.商品名 = 商品名; }

	public String get本部コード(){ return this.本部コード; }

	public void set本部コード(String 本部コード){ this.本部コード = 本部コード; }

	public String get事業部コード(){ return this.事業部コード; }

	public void set事業部コード(String 事業部コード){ this.事業部コード = 事業部コード; }

	public String get部コード(){ return this.部コード; }

	public void set部コード(String 部コード){ this.部コード = 部コード; }

	public String getグループコード(){ return this.グループコード; }

	public void setグループコード(String グループコード){ this.グループコード = グループコード; }

	public String get本部名(){ return this.本部名; }

	public void set本部名(String 本部名){ this.本部名 = 本部名; }

	public String get事業部名(){ return this.事業部名; }

	public void set事業部名(String 事業部名){ this.事業部名 = 事業部名; }

	public String get部名(){ return this.部名; }

	public void set部名(String 部名){ this.部名 = 部名; }

	public String getグループ名(){ return this.グループ名; }

	public void setグループ名(String グループ名){ this.グループ名 = グループ名; }

	public String get作業者コード(){ return this.作業者コード; }

	public void set作業者コード(String 作業者コード){ this.作業者コード = 作業者コード; }

	public String get作業者名(){ return this.作業者名; }

	public void set作業者名(String 作業者名){ this.作業者名 = 作業者名; }

	public String get役職コード(){ return this.役職コード; }

	public void set役職コード(String 役職コード){ this.役職コード = 役職コード; }

	public String get役職名(){ return this.役職名; }

	public void set役職名(String 役職名){ this.役職名 = 役職名; }

	public String getスピリットフラグ(){ return this.スピリットフラグ; }

	public void setスピリットフラグ(String スピリットフラグ){ this.スピリットフラグ = スピリットフラグ; }

	public String get作業区分(){ return this.作業区分; }

	public void set作業区分(String 作業区分){ this.作業区分 = 作業区分; }

	public String getキャリア名(){ return this.キャリア名; }

	public void setキャリア名(String キャリア名){ this.キャリア名 = キャリア名; }

	public String getエキスパート区分(){ return this.エキスパート区分; }

	public void setエキスパート区分(String エキスパート区分){ this.エキスパート区分 = エキスパート区分; }

	public java.math.BigDecimal get二十日迄工数(){ return this.二十日迄工数; }

	public void set二十日迄工数(java.math.BigDecimal 二十日迄工数){ this.二十日迄工数 = 二十日迄工数; }

	public java.math.BigDecimal get二十日以降工数(){ return this.二十日以降工数; }

	public void set二十日以降工数(java.math.BigDecimal 二十日以降工数){ this.二十日以降工数 = 二十日以降工数; }

	public java.math.BigDecimal get月度計工数(){ return this.月度計工数; }

	public void set月度計工数(java.math.BigDecimal 月度計工数){ this.月度計工数 = 月度計工数; }

	public java.math.BigDecimal get原価対象旅費(){ return this.原価対象旅費; }

	public void set原価対象旅費(java.math.BigDecimal 原価対象旅費){ this.原価対象旅費 = 原価対象旅費; }

	public String toString(){
		StringBuffer buffer = new StringBuffer();
		buffer.append("[Ft_worktimeVo:");
		buffer.append(" データ種別: ");
		buffer.append(データ種別);
		buffer.append(" 月度: ");
		buffer.append(月度);
		buffer.append(" 締日区分: ");
		buffer.append(締日区分);
		buffer.append(" 担当本部コード: ");
		buffer.append(担当本部コード);
		buffer.append(" 担当事業部コード: ");
		buffer.append(担当事業部コード);
		buffer.append(" 担当部コード: ");
		buffer.append(担当部コード);
		buffer.append(" 担当グループコード: ");
		buffer.append(担当グループコード);
		buffer.append(" 担当本部名: ");
		buffer.append(担当本部名);
		buffer.append(" 担当事業部名: ");
		buffer.append(担当事業部名);
		buffer.append(" 担当部名: ");
		buffer.append(担当部名);
		buffer.append(" 担当グループ名: ");
		buffer.append(担当グループ名);
		buffer.append(" オーダ識別区分: ");
		buffer.append(オーダ識別区分);
		buffer.append(" 受注番号: ");
		buffer.append(受注番号);
		buffer.append(" 受注明細番号: ");
		buffer.append(受注明細番号);
		buffer.append(" 受注明細枝番: ");
		buffer.append(受注明細枝番);
		buffer.append(" 得意先コード: ");
		buffer.append(得意先コード);
		buffer.append(" 得意先名: ");
		buffer.append(得意先名);
		buffer.append(" ユーザコード: ");
		buffer.append(ユーザコード);
		buffer.append(" ユーザ名: ");
		buffer.append(ユーザ名);
		buffer.append(" 件名: ");
		buffer.append(件名);
		buffer.append(" 商品名: ");
		buffer.append(商品名);
		buffer.append(" 本部コード: ");
		buffer.append(本部コード);
		buffer.append(" 事業部コード: ");
		buffer.append(事業部コード);
		buffer.append(" 部コード: ");
		buffer.append(部コード);
		buffer.append(" グループコード: ");
		buffer.append(グループコード);
		buffer.append(" 本部名: ");
		buffer.append(本部名);
		buffer.append(" 事業部名: ");
		buffer.append(事業部名);
		buffer.append(" 部名: ");
		buffer.append(部名);
		buffer.append(" グループ名: ");
		buffer.append(グループ名);
		buffer.append(" 作業者コード: ");
		buffer.append(作業者コード);
		buffer.append(" 作業者名: ");
		buffer.append(作業者名);
		buffer.append(" 役職コード: ");
		buffer.append(役職コード);
		buffer.append(" 役職名: ");
		buffer.append(役職名);
		buffer.append(" スピリットフラグ: ");
		buffer.append(スピリットフラグ);
		buffer.append(" 作業区分: ");
		buffer.append(作業区分);
		buffer.append(" キャリア名: ");
		buffer.append(キャリア名);
		buffer.append(" エキスパート区分: ");
		buffer.append(エキスパート区分);
		buffer.append(" 二十日迄工数: ");
		buffer.append(二十日迄工数);
		buffer.append(" 二十日以降工数: ");
		buffer.append(二十日以降工数);
		buffer.append(" 月度計工数: ");
		buffer.append(月度計工数);
		buffer.append(" 原価対象旅費: ");
		buffer.append(原価対象旅費);
		buffer.append("]");
		return buffer.toString();
	}

}
