/* Code Generator Information.
 * generator Version 1.0.0 release 2007/10/10
 * generated Date Mon Aug 18 14:51:57 JST 2014
 */
import java.io.Serializable;

/**
 * Ft_planorderVo.
 * @author cypher256
 * @version 1.0 
 * history 
 * Symbol	Date		Person		Note
 * [1]		2014/08/18	cypher256		Generated.
 */
public class Ft_planorderVo implements Serializable{

	public static final String TABLE = "FT_PLANORDER";

	/**
	 * 受注計画番号:varchar2(10) <Primary Key>
	 */
	private String 受注計画番号;

	/**
	 * 件名:varchar2(120)
	 */
	private String 件名;

	/**
	 * 得意先:varchar2(50)
	 */
	private String 得意先;

	/**
	 * ユーザ:varchar2(50)
	 */
	private String ユーザ;

	/**
	 * 受注番号:varchar2(10)
	 */
	private String 受注番号;

	/**
	 * 見積番号:varchar2(10)
	 */
	private String 見積番号;

	/**
	 * 注文番号:varchar2(10)
	 */
	private String 注文番号;

	/**
	 * 手続状態:varchar2(20)
	 */
	private String 手続状態;

	/**
	 * 売上予測:number(10)
	 */
	private java.math.BigDecimal 売上予測;

	/**
	 * 原価予測:number(10)
	 */
	private java.math.BigDecimal 原価予測;

	/**
	 * 原価率:number(1,3)
	 */
	private java.math.BigDecimal 原価率;

	/**
	 * 注文金額一括:number(10)
	 */
	private java.math.BigDecimal 注文金額一括;

	/**
	 * 見積原価一括:number(10)
	 */
	private java.math.BigDecimal 見積原価一括;

	/**
	 * 原価率一括:number(1,3)
	 */
	private java.math.BigDecimal 原価率一括;

	/**
	 * 注文金額月額:number(10)
	 */
	private java.math.BigDecimal 注文金額月額;

	/**
	 * 見積原価月額:number(10)
	 */
	private java.math.BigDecimal 見積原価月額;

	/**
	 * 原価率月額:number(1,3)
	 */
	private java.math.BigDecimal 原価率月額;

	/**
	 * 注文金額年額:number(10)
	 */
	private java.math.BigDecimal 注文金額年額;

	/**
	 * 見積原価年額:number(10)
	 */
	private java.math.BigDecimal 見積原価年額;

	/**
	 * 原価率年額:number(1,3)
	 */
	private java.math.BigDecimal 原価率年額;

	/**
	 * 注文金額実績:number(10)
	 */
	private java.math.BigDecimal 注文金額実績;

	/**
	 * 見積原価実績:number(10)
	 */
	private java.math.BigDecimal 見積原価実績;

	/**
	 * 原価率実績:number(1,3)
	 */
	private java.math.BigDecimal 原価率実績;

	/**
	 * 受注予定日付:date(0)
	 */
	private java.sql.Timestamp 受注予定日付;

	/**
	 * 先行:varchar2(5)
	 */
	private String 先行;

	/**
	 * 受注ランク:varchar2(3)
	 */
	private String 受注ランク;

	/**
	 * 受注担当:varchar2(50)
	 */
	private String 受注担当;

	/**
	 * 売上担当:varchar2(50)
	 */
	private String 売上担当;

	/**
	* Constractor
	*/
	public Ft_planorderVo(){}

	/**
	* Constractor
	* @param <code>受注計画番号</code>
	*/
	public Ft_planorderVo(String 受注計画番号){
		this.受注計画番号 = 受注計画番号;
	}

	public String get受注計画番号(){ return this.受注計画番号; }

	public void set受注計画番号(String 受注計画番号){ this.受注計画番号 = 受注計画番号; }

	public String get件名(){ return this.件名; }

	public void set件名(String 件名){ this.件名 = 件名; }

	public String get得意先(){ return this.得意先; }

	public void set得意先(String 得意先){ this.得意先 = 得意先; }

	public String getユーザ(){ return this.ユーザ; }

	public void setユーザ(String ユーザ){ this.ユーザ = ユーザ; }

	public String get受注番号(){ return this.受注番号; }

	public void set受注番号(String 受注番号){ this.受注番号 = 受注番号; }

	public String get見積番号(){ return this.見積番号; }

	public void set見積番号(String 見積番号){ this.見積番号 = 見積番号; }

	public String get注文番号(){ return this.注文番号; }

	public void set注文番号(String 注文番号){ this.注文番号 = 注文番号; }

	public String get手続状態(){ return this.手続状態; }

	public void set手続状態(String 手続状態){ this.手続状態 = 手続状態; }

	public java.math.BigDecimal get売上予測(){ return this.売上予測; }

	public void set売上予測(java.math.BigDecimal 売上予測){ this.売上予測 = 売上予測; }

	public java.math.BigDecimal get原価予測(){ return this.原価予測; }

	public void set原価予測(java.math.BigDecimal 原価予測){ this.原価予測 = 原価予測; }

	public java.math.BigDecimal get原価率(){ return this.原価率; }

	public void set原価率(java.math.BigDecimal 原価率){ this.原価率 = 原価率; }

	public java.math.BigDecimal get注文金額一括(){ return this.注文金額一括; }

	public void set注文金額一括(java.math.BigDecimal 注文金額一括){ this.注文金額一括 = 注文金額一括; }

	public java.math.BigDecimal get見積原価一括(){ return this.見積原価一括; }

	public void set見積原価一括(java.math.BigDecimal 見積原価一括){ this.見積原価一括 = 見積原価一括; }

	public java.math.BigDecimal get原価率一括(){ return this.原価率一括; }

	public void set原価率一括(java.math.BigDecimal 原価率一括){ this.原価率一括 = 原価率一括; }

	public java.math.BigDecimal get注文金額月額(){ return this.注文金額月額; }

	public void set注文金額月額(java.math.BigDecimal 注文金額月額){ this.注文金額月額 = 注文金額月額; }

	public java.math.BigDecimal get見積原価月額(){ return this.見積原価月額; }

	public void set見積原価月額(java.math.BigDecimal 見積原価月額){ this.見積原価月額 = 見積原価月額; }

	public java.math.BigDecimal get原価率月額(){ return this.原価率月額; }

	public void set原価率月額(java.math.BigDecimal 原価率月額){ this.原価率月額 = 原価率月額; }

	public java.math.BigDecimal get注文金額年額(){ return this.注文金額年額; }

	public void set注文金額年額(java.math.BigDecimal 注文金額年額){ this.注文金額年額 = 注文金額年額; }

	public java.math.BigDecimal get見積原価年額(){ return this.見積原価年額; }

	public void set見積原価年額(java.math.BigDecimal 見積原価年額){ this.見積原価年額 = 見積原価年額; }

	public java.math.BigDecimal get原価率年額(){ return this.原価率年額; }

	public void set原価率年額(java.math.BigDecimal 原価率年額){ this.原価率年額 = 原価率年額; }

	public java.math.BigDecimal get注文金額実績(){ return this.注文金額実績; }

	public void set注文金額実績(java.math.BigDecimal 注文金額実績){ this.注文金額実績 = 注文金額実績; }

	public java.math.BigDecimal get見積原価実績(){ return this.見積原価実績; }

	public void set見積原価実績(java.math.BigDecimal 見積原価実績){ this.見積原価実績 = 見積原価実績; }

	public java.math.BigDecimal get原価率実績(){ return this.原価率実績; }

	public void set原価率実績(java.math.BigDecimal 原価率実績){ this.原価率実績 = 原価率実績; }

	public java.sql.Timestamp get受注予定日付(){ return this.受注予定日付; }

	public void set受注予定日付(java.sql.Timestamp 受注予定日付){ this.受注予定日付 = 受注予定日付; }

	public String get先行(){ return this.先行; }

	public void set先行(String 先行){ this.先行 = 先行; }

	public String get受注ランク(){ return this.受注ランク; }

	public void set受注ランク(String 受注ランク){ this.受注ランク = 受注ランク; }

	public String get受注担当(){ return this.受注担当; }

	public void set受注担当(String 受注担当){ this.受注担当 = 受注担当; }

	public String get売上担当(){ return this.売上担当; }

	public void set売上担当(String 売上担当){ this.売上担当 = 売上担当; }

	public String toString(){
		StringBuffer buffer = new StringBuffer();
		buffer.append("[Ft_planorderVo:");
		buffer.append(" 受注計画番号: ");
		buffer.append(受注計画番号);
		buffer.append(" 件名: ");
		buffer.append(件名);
		buffer.append(" 得意先: ");
		buffer.append(得意先);
		buffer.append(" ユーザ: ");
		buffer.append(ユーザ);
		buffer.append(" 受注番号: ");
		buffer.append(受注番号);
		buffer.append(" 見積番号: ");
		buffer.append(見積番号);
		buffer.append(" 注文番号: ");
		buffer.append(注文番号);
		buffer.append(" 手続状態: ");
		buffer.append(手続状態);
		buffer.append(" 売上予測: ");
		buffer.append(売上予測);
		buffer.append(" 原価予測: ");
		buffer.append(原価予測);
		buffer.append(" 原価率: ");
		buffer.append(原価率);
		buffer.append(" 注文金額一括: ");
		buffer.append(注文金額一括);
		buffer.append(" 見積原価一括: ");
		buffer.append(見積原価一括);
		buffer.append(" 原価率一括: ");
		buffer.append(原価率一括);
		buffer.append(" 注文金額月額: ");
		buffer.append(注文金額月額);
		buffer.append(" 見積原価月額: ");
		buffer.append(見積原価月額);
		buffer.append(" 原価率月額: ");
		buffer.append(原価率月額);
		buffer.append(" 注文金額年額: ");
		buffer.append(注文金額年額);
		buffer.append(" 見積原価年額: ");
		buffer.append(見積原価年額);
		buffer.append(" 原価率年額: ");
		buffer.append(原価率年額);
		buffer.append(" 注文金額実績: ");
		buffer.append(注文金額実績);
		buffer.append(" 見積原価実績: ");
		buffer.append(見積原価実績);
		buffer.append(" 原価率実績: ");
		buffer.append(原価率実績);
		buffer.append(" 受注予定日付: ");
		buffer.append(受注予定日付);
		buffer.append(" 先行: ");
		buffer.append(先行);
		buffer.append(" 受注ランク: ");
		buffer.append(受注ランク);
		buffer.append(" 受注担当: ");
		buffer.append(受注担当);
		buffer.append(" 売上担当: ");
		buffer.append(売上担当);
		buffer.append("]");
		return buffer.toString();
	}

}
