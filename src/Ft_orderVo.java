/* Code Generator Information.
 * generator Version 1.0.0 release 2007/10/10
 * generated Date Mon Aug 18 14:50:29 JST 2014
 */
import java.io.Serializable;

/**
 * Ft_orderVo.
 * @author cypher256
 * @version 1.0 
 * history 
 * Symbol	Date		Person		Note
 * [1]		2014/08/18	cypher256		Generated.
 */
public class Ft_orderVo implements Serializable{

	public static final String TABLE = "FT_ORDER";

	/**
	 * 先行区分:varchar2(5)
	 */
	private String 先行区分;

	/**
	 * 受注計画番号:varchar2(10)
	 */
	private String 受注計画番号;

	/**
	 * オーダ識別区分:varchar2(1) <Primary Key>
	 */
	private String オーダ識別区分;

	/**
	 * 受注番号:varchar2(10) <Primary Key>
	 */
	private String 受注番号;

	/**
	 * 明細番号:varchar2(3) <Primary Key>
	 */
	private String 明細番号;

	/**
	 * 明細枝番:varchar2(3) <Primary Key>
	 */
	private String 明細枝番;

	/**
	 * 受注本部コード:varchar2(3)
	 */
	private String 受注本部コード;

	/**
	 * 受注事業部コード:varchar2(3)
	 */
	private String 受注事業部コード;

	/**
	 * 受注部コード:varchar2(3)
	 */
	private String 受注部コード;

	/**
	 * 受注グループコード:varchar2(3)
	 */
	private String 受注グループコード;

	/**
	 * 受注本部名:varchar2(50)
	 */
	private String 受注本部名;

	/**
	 * 受注事業部名:varchar2(50)
	 */
	private String 受注事業部名;

	/**
	 * 受注部名:varchar2(50)
	 */
	private String 受注部名;

	/**
	 * 受注グループ名:varchar2(50)
	 */
	private String 受注グループ名;

	/**
	 * 受注担当者:varchar2(30)
	 */
	private String 受注担当者;

	/**
	 * 売上本部コード:varchar2(3)
	 */
	private String 売上本部コード;

	/**
	 * 売上事業部コード:varchar2(3)
	 */
	private String 売上事業部コード;

	/**
	 * 売上部コード:varchar2(3)
	 */
	private String 売上部コード;

	/**
	 * 売上グループコード:varchar2(3)
	 */
	private String 売上グループコード;

	/**
	 * 売上本部名:varchar2(50)
	 */
	private String 売上本部名;

	/**
	 * 売上事業部名:varchar2(50)
	 */
	private String 売上事業部名;

	/**
	 * 売上部名:varchar2(50)
	 */
	private String 売上部名;

	/**
	 * 売上グループ名:varchar2(50)
	 */
	private String 売上グループ名;

	/**
	 * 売上担当者:varchar2(30)
	 */
	private String 売上担当者;

	/**
	 * 得意先コード:varchar2(10)
	 */
	private String 得意先コード;

	/**
	 * 得意先名:varchar2(50)
	 */
	private String 得意先名;

	/**
	 * 得意先種別区分:varchar2(3)
	 */
	private String 得意先種別区分;

	/**
	 * 得意先種別名:varchar2(50)
	 */
	private String 得意先種別名;

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
	 * 注文番号:varchar2(10)
	 */
	private String 注文番号;

	/**
	 * 依頼元製番:varchar2(20)
	 */
	private String 依頼元製番;

	/**
	 * 取引形態:varchar2(3)
	 */
	private String 取引形態;

	/**
	 * 取引形態名:varchar2(10)
	 */
	private String 取引形態名;

	/**
	 * 商品コード:varchar2(10)
	 */
	private String 商品コード;

	/**
	 * 商品名:varchar2(30)
	 */
	private String 商品名;

	/**
	 * 商品大分類コード:varchar2(3)
	 */
	private String 商品大分類コード;

	/**
	 * 商品中分類コード:varchar2(3)
	 */
	private String 商品中分類コード;

	/**
	 * 商品小分類コード:varchar2(3)
	 */
	private String 商品小分類コード;

	/**
	 * 商品大分類名:varchar2(30)
	 */
	private String 商品大分類名;

	/**
	 * 商品中分類名:varchar2(30)
	 */
	private String 商品中分類名;

	/**
	 * 商品小分類名:varchar2(30)
	 */
	private String 商品小分類名;

	/**
	 * 売上金額:number(12)
	 */
	private java.math.BigDecimal 売上金額;

	/**
	 * 開始日:date(0)
	 */
	private java.sql.Timestamp 開始日;

	/**
	 * 納入予定日:date(0)
	 */
	private java.sql.Timestamp 納入予定日;

	/**
	 * 検収終了予定日:date(0)
	 */
	private java.sql.Timestamp 検収終了予定日;

	/**
	 * 検収日:date(0)
	 */
	private java.sql.Timestamp 検収日;

	/**
	 * 完了日:date(0)
	 */
	private java.sql.Timestamp 完了日;

	/**
	 * 自動延長対象:varchar2(4)
	 */
	private String 自動延長対象;

	/**
	 * 注文書回収状況区分:varchar2(3)
	 */
	private String 注文書回収状況区分;

	/**
	 * 注文書回収状況名称:varchar2(30)
	 */
	private String 注文書回収状況名称;

	/**
	 * 社内売上金額:number(12)
	 */
	private java.math.BigDecimal 社内売上金額;

	/**
	 * 受注分析項目コード1:varchar2(3)
	 */
	private String 受注分析項目コード1;

	/**
	 * 受注分析項目名1:varchar2(30)
	 */
	private String 受注分析項目名1;

	/**
	 * 受注分析項目コード2:varchar2(3)
	 */
	private String 受注分析項目コード2;

	/**
	 * 受注分析項目名2:varchar2(30)
	 */
	private String 受注分析項目名2;

	/**
	 * 受注分析項目コード3:varchar2(3)
	 */
	private String 受注分析項目コード3;

	/**
	 * 受注分析項目名3:varchar2(30)
	 */
	private String 受注分析項目名3;

	/**
	 * 受注分析項目コード4:varchar2(3)
	 */
	private String 受注分析項目コード4;

	/**
	 * 受注分析項目名4:varchar2(30)
	 */
	private String 受注分析項目名4;

	/**
	 * 受注分析項目コード5:varchar2(3)
	 */
	private String 受注分析項目コード5;

	/**
	 * 受注分析項目名5:varchar2(30)
	 */
	private String 受注分析項目名5;

	/**
	 * 受注分析項目コード6:varchar2(3)
	 */
	private String 受注分析項目コード6;

	/**
	 * 受注分析項目名6:varchar2(30)
	 */
	private String 受注分析項目名6;

	/**
	 * 受注分析項目コード7:varchar2(3)
	 */
	private String 受注分析項目コード7;

	/**
	 * 受注分析項目名7:varchar2(30)
	 */
	private String 受注分析項目名7;

	/**
	 * 受注分析項目コード8:varchar2(3)
	 */
	private String 受注分析項目コード8;

	/**
	 * 受注分析項目名8:varchar2(30)
	 */
	private String 受注分析項目名8;

	/**
	 * 受注分析項目コード9:varchar2(3)
	 */
	private String 受注分析項目コード9;

	/**
	 * 受注分析項目名9:varchar2(30)
	 */
	private String 受注分析項目名9;

	/**
	 * 受注分析項目コード10:varchar2(3)
	 */
	private String 受注分析項目コード10;

	/**
	 * 受注分析項目名10:varchar2(30)
	 */
	private String 受注分析項目名10;

	/**
	 * 売上分析項目コード1:varchar2(3)
	 */
	private String 売上分析項目コード1;

	/**
	 * 売上分析項目名1:varchar2(30)
	 */
	private String 売上分析項目名1;

	/**
	 * 売上分析項目コード2:varchar2(3)
	 */
	private String 売上分析項目コード2;

	/**
	 * 売上分析項目名2:varchar2(30)
	 */
	private String 売上分析項目名2;

	/**
	 * 売上分析項目コード3:varchar2(3)
	 */
	private String 売上分析項目コード3;

	/**
	 * 売上分析項目名3:varchar2(30)
	 */
	private String 売上分析項目名3;

	/**
	 * 売上分析項目コード4:varchar2(3)
	 */
	private String 売上分析項目コード4;

	/**
	 * 売上分析項目名4:varchar2(30)
	 */
	private String 売上分析項目名4;

	/**
	 * 売上分析項目コード5:varchar2(3)
	 */
	private String 売上分析項目コード5;

	/**
	 * 売上分析項目名5:varchar2(30)
	 */
	private String 売上分析項目名5;

	/**
	 * 売上分析項目コード6:varchar2(3)
	 */
	private String 売上分析項目コード6;

	/**
	 * 売上分析項目名6:varchar2(30)
	 */
	private String 売上分析項目名6;

	/**
	 * 売上分析項目コード7:varchar2(3)
	 */
	private String 売上分析項目コード7;

	/**
	 * 売上分析項目名7:varchar2(30)
	 */
	private String 売上分析項目名7;

	/**
	 * 売上分析項目コード8:varchar2(3)
	 */
	private String 売上分析項目コード8;

	/**
	 * 売上分析項目名8:varchar2(30)
	 */
	private String 売上分析項目名8;

	/**
	 * 売上分析項目コード9:varchar2(3)
	 */
	private String 売上分析項目コード9;

	/**
	 * 売上分析項目名9:varchar2(30)
	 */
	private String 売上分析項目名9;

	/**
	 * 売上分析項目コード10:varchar2(3)
	 */
	private String 売上分析項目コード10;

	/**
	 * 売上分析項目名10:varchar2(30)
	 */
	private String 売上分析項目名10;

	/**
	 * 金額後報:varchar2(3)
	 */
	private String 金額後報;

	/**
	* Constractor
	*/
	public Ft_orderVo(){}

	/**
	* Constractor
	* @param <code>オーダ識別区分</code>
	* @param <code>受注番号</code>
	* @param <code>明細番号</code>
	* @param <code>明細枝番</code>
	*/
	public Ft_orderVo(String オーダ識別区分, String 受注番号, String 明細番号, String 明細枝番){
		this.オーダ識別区分 = オーダ識別区分;
		this.受注番号 = 受注番号;
		this.明細番号 = 明細番号;
		this.明細枝番 = 明細枝番;
	}

	public String get先行区分(){ return this.先行区分; }

	public void set先行区分(String 先行区分){ this.先行区分 = 先行区分; }

	public String get受注計画番号(){ return this.受注計画番号; }

	public void set受注計画番号(String 受注計画番号){ this.受注計画番号 = 受注計画番号; }

	public String getオーダ識別区分(){ return this.オーダ識別区分; }

	public void setオーダ識別区分(String オーダ識別区分){ this.オーダ識別区分 = オーダ識別区分; }

	public String get受注番号(){ return this.受注番号; }

	public void set受注番号(String 受注番号){ this.受注番号 = 受注番号; }

	public String get明細番号(){ return this.明細番号; }

	public void set明細番号(String 明細番号){ this.明細番号 = 明細番号; }

	public String get明細枝番(){ return this.明細枝番; }

	public void set明細枝番(String 明細枝番){ this.明細枝番 = 明細枝番; }

	public String get受注本部コード(){ return this.受注本部コード; }

	public void set受注本部コード(String 受注本部コード){ this.受注本部コード = 受注本部コード; }

	public String get受注事業部コード(){ return this.受注事業部コード; }

	public void set受注事業部コード(String 受注事業部コード){ this.受注事業部コード = 受注事業部コード; }

	public String get受注部コード(){ return this.受注部コード; }

	public void set受注部コード(String 受注部コード){ this.受注部コード = 受注部コード; }

	public String get受注グループコード(){ return this.受注グループコード; }

	public void set受注グループコード(String 受注グループコード){ this.受注グループコード = 受注グループコード; }

	public String get受注本部名(){ return this.受注本部名; }

	public void set受注本部名(String 受注本部名){ this.受注本部名 = 受注本部名; }

	public String get受注事業部名(){ return this.受注事業部名; }

	public void set受注事業部名(String 受注事業部名){ this.受注事業部名 = 受注事業部名; }

	public String get受注部名(){ return this.受注部名; }

	public void set受注部名(String 受注部名){ this.受注部名 = 受注部名; }

	public String get受注グループ名(){ return this.受注グループ名; }

	public void set受注グループ名(String 受注グループ名){ this.受注グループ名 = 受注グループ名; }

	public String get受注担当者(){ return this.受注担当者; }

	public void set受注担当者(String 受注担当者){ this.受注担当者 = 受注担当者; }

	public String get売上本部コード(){ return this.売上本部コード; }

	public void set売上本部コード(String 売上本部コード){ this.売上本部コード = 売上本部コード; }

	public String get売上事業部コード(){ return this.売上事業部コード; }

	public void set売上事業部コード(String 売上事業部コード){ this.売上事業部コード = 売上事業部コード; }

	public String get売上部コード(){ return this.売上部コード; }

	public void set売上部コード(String 売上部コード){ this.売上部コード = 売上部コード; }

	public String get売上グループコード(){ return this.売上グループコード; }

	public void set売上グループコード(String 売上グループコード){ this.売上グループコード = 売上グループコード; }

	public String get売上本部名(){ return this.売上本部名; }

	public void set売上本部名(String 売上本部名){ this.売上本部名 = 売上本部名; }

	public String get売上事業部名(){ return this.売上事業部名; }

	public void set売上事業部名(String 売上事業部名){ this.売上事業部名 = 売上事業部名; }

	public String get売上部名(){ return this.売上部名; }

	public void set売上部名(String 売上部名){ this.売上部名 = 売上部名; }

	public String get売上グループ名(){ return this.売上グループ名; }

	public void set売上グループ名(String 売上グループ名){ this.売上グループ名 = 売上グループ名; }

	public String get売上担当者(){ return this.売上担当者; }

	public void set売上担当者(String 売上担当者){ this.売上担当者 = 売上担当者; }

	public String get得意先コード(){ return this.得意先コード; }

	public void set得意先コード(String 得意先コード){ this.得意先コード = 得意先コード; }

	public String get得意先名(){ return this.得意先名; }

	public void set得意先名(String 得意先名){ this.得意先名 = 得意先名; }

	public String get得意先種別区分(){ return this.得意先種別区分; }

	public void set得意先種別区分(String 得意先種別区分){ this.得意先種別区分 = 得意先種別区分; }

	public String get得意先種別名(){ return this.得意先種別名; }

	public void set得意先種別名(String 得意先種別名){ this.得意先種別名 = 得意先種別名; }

	public String getユーザコード(){ return this.ユーザコード; }

	public void setユーザコード(String ユーザコード){ this.ユーザコード = ユーザコード; }

	public String getユーザ名(){ return this.ユーザ名; }

	public void setユーザ名(String ユーザ名){ this.ユーザ名 = ユーザ名; }

	public String get件名(){ return this.件名; }

	public void set件名(String 件名){ this.件名 = 件名; }

	public String get注文番号(){ return this.注文番号; }

	public void set注文番号(String 注文番号){ this.注文番号 = 注文番号; }

	public String get依頼元製番(){ return this.依頼元製番; }

	public void set依頼元製番(String 依頼元製番){ this.依頼元製番 = 依頼元製番; }

	public String get取引形態(){ return this.取引形態; }

	public void set取引形態(String 取引形態){ this.取引形態 = 取引形態; }

	public String get取引形態名(){ return this.取引形態名; }

	public void set取引形態名(String 取引形態名){ this.取引形態名 = 取引形態名; }

	public String get商品コード(){ return this.商品コード; }

	public void set商品コード(String 商品コード){ this.商品コード = 商品コード; }

	public String get商品名(){ return this.商品名; }

	public void set商品名(String 商品名){ this.商品名 = 商品名; }

	public String get商品大分類コード(){ return this.商品大分類コード; }

	public void set商品大分類コード(String 商品大分類コード){ this.商品大分類コード = 商品大分類コード; }

	public String get商品中分類コード(){ return this.商品中分類コード; }

	public void set商品中分類コード(String 商品中分類コード){ this.商品中分類コード = 商品中分類コード; }

	public String get商品小分類コード(){ return this.商品小分類コード; }

	public void set商品小分類コード(String 商品小分類コード){ this.商品小分類コード = 商品小分類コード; }

	public String get商品大分類名(){ return this.商品大分類名; }

	public void set商品大分類名(String 商品大分類名){ this.商品大分類名 = 商品大分類名; }

	public String get商品中分類名(){ return this.商品中分類名; }

	public void set商品中分類名(String 商品中分類名){ this.商品中分類名 = 商品中分類名; }

	public String get商品小分類名(){ return this.商品小分類名; }

	public void set商品小分類名(String 商品小分類名){ this.商品小分類名 = 商品小分類名; }

	public java.math.BigDecimal get売上金額(){ return this.売上金額; }

	public void set売上金額(java.math.BigDecimal 売上金額){ this.売上金額 = 売上金額; }

	public java.sql.Timestamp get開始日(){ return this.開始日; }

	public void set開始日(java.sql.Timestamp 開始日){ this.開始日 = 開始日; }

	public java.sql.Timestamp get納入予定日(){ return this.納入予定日; }

	public void set納入予定日(java.sql.Timestamp 納入予定日){ this.納入予定日 = 納入予定日; }

	public java.sql.Timestamp get検収終了予定日(){ return this.検収終了予定日; }

	public void set検収終了予定日(java.sql.Timestamp 検収終了予定日){ this.検収終了予定日 = 検収終了予定日; }

	public java.sql.Timestamp get検収日(){ return this.検収日; }

	public void set検収日(java.sql.Timestamp 検収日){ this.検収日 = 検収日; }

	public java.sql.Timestamp get完了日(){ return this.完了日; }

	public void set完了日(java.sql.Timestamp 完了日){ this.完了日 = 完了日; }

	public String get自動延長対象(){ return this.自動延長対象; }

	public void set自動延長対象(String 自動延長対象){ this.自動延長対象 = 自動延長対象; }

	public String get注文書回収状況区分(){ return this.注文書回収状況区分; }

	public void set注文書回収状況区分(String 注文書回収状況区分){ this.注文書回収状況区分 = 注文書回収状況区分; }

	public String get注文書回収状況名称(){ return this.注文書回収状況名称; }

	public void set注文書回収状況名称(String 注文書回収状況名称){ this.注文書回収状況名称 = 注文書回収状況名称; }

	public java.math.BigDecimal get社内売上金額(){ return this.社内売上金額; }

	public void set社内売上金額(java.math.BigDecimal 社内売上金額){ this.社内売上金額 = 社内売上金額; }

	public String get受注分析項目コード1(){ return this.受注分析項目コード1; }

	public void set受注分析項目コード1(String 受注分析項目コード1){ this.受注分析項目コード1 = 受注分析項目コード1; }

	public String get受注分析項目名1(){ return this.受注分析項目名1; }

	public void set受注分析項目名1(String 受注分析項目名1){ this.受注分析項目名1 = 受注分析項目名1; }

	public String get受注分析項目コード2(){ return this.受注分析項目コード2; }

	public void set受注分析項目コード2(String 受注分析項目コード2){ this.受注分析項目コード2 = 受注分析項目コード2; }

	public String get受注分析項目名2(){ return this.受注分析項目名2; }

	public void set受注分析項目名2(String 受注分析項目名2){ this.受注分析項目名2 = 受注分析項目名2; }

	public String get受注分析項目コード3(){ return this.受注分析項目コード3; }

	public void set受注分析項目コード3(String 受注分析項目コード3){ this.受注分析項目コード3 = 受注分析項目コード3; }

	public String get受注分析項目名3(){ return this.受注分析項目名3; }

	public void set受注分析項目名3(String 受注分析項目名3){ this.受注分析項目名3 = 受注分析項目名3; }

	public String get受注分析項目コード4(){ return this.受注分析項目コード4; }

	public void set受注分析項目コード4(String 受注分析項目コード4){ this.受注分析項目コード4 = 受注分析項目コード4; }

	public String get受注分析項目名4(){ return this.受注分析項目名4; }

	public void set受注分析項目名4(String 受注分析項目名4){ this.受注分析項目名4 = 受注分析項目名4; }

	public String get受注分析項目コード5(){ return this.受注分析項目コード5; }

	public void set受注分析項目コード5(String 受注分析項目コード5){ this.受注分析項目コード5 = 受注分析項目コード5; }

	public String get受注分析項目名5(){ return this.受注分析項目名5; }

	public void set受注分析項目名5(String 受注分析項目名5){ this.受注分析項目名5 = 受注分析項目名5; }

	public String get受注分析項目コード6(){ return this.受注分析項目コード6; }

	public void set受注分析項目コード6(String 受注分析項目コード6){ this.受注分析項目コード6 = 受注分析項目コード6; }

	public String get受注分析項目名6(){ return this.受注分析項目名6; }

	public void set受注分析項目名6(String 受注分析項目名6){ this.受注分析項目名6 = 受注分析項目名6; }

	public String get受注分析項目コード7(){ return this.受注分析項目コード7; }

	public void set受注分析項目コード7(String 受注分析項目コード7){ this.受注分析項目コード7 = 受注分析項目コード7; }

	public String get受注分析項目名7(){ return this.受注分析項目名7; }

	public void set受注分析項目名7(String 受注分析項目名7){ this.受注分析項目名7 = 受注分析項目名7; }

	public String get受注分析項目コード8(){ return this.受注分析項目コード8; }

	public void set受注分析項目コード8(String 受注分析項目コード8){ this.受注分析項目コード8 = 受注分析項目コード8; }

	public String get受注分析項目名8(){ return this.受注分析項目名8; }

	public void set受注分析項目名8(String 受注分析項目名8){ this.受注分析項目名8 = 受注分析項目名8; }

	public String get受注分析項目コード9(){ return this.受注分析項目コード9; }

	public void set受注分析項目コード9(String 受注分析項目コード9){ this.受注分析項目コード9 = 受注分析項目コード9; }

	public String get受注分析項目名9(){ return this.受注分析項目名9; }

	public void set受注分析項目名9(String 受注分析項目名9){ this.受注分析項目名9 = 受注分析項目名9; }

	public String get受注分析項目コード10(){ return this.受注分析項目コード10; }

	public void set受注分析項目コード10(String 受注分析項目コード10){ this.受注分析項目コード10 = 受注分析項目コード10; }

	public String get受注分析項目名10(){ return this.受注分析項目名10; }

	public void set受注分析項目名10(String 受注分析項目名10){ this.受注分析項目名10 = 受注分析項目名10; }

	public String get売上分析項目コード1(){ return this.売上分析項目コード1; }

	public void set売上分析項目コード1(String 売上分析項目コード1){ this.売上分析項目コード1 = 売上分析項目コード1; }

	public String get売上分析項目名1(){ return this.売上分析項目名1; }

	public void set売上分析項目名1(String 売上分析項目名1){ this.売上分析項目名1 = 売上分析項目名1; }

	public String get売上分析項目コード2(){ return this.売上分析項目コード2; }

	public void set売上分析項目コード2(String 売上分析項目コード2){ this.売上分析項目コード2 = 売上分析項目コード2; }

	public String get売上分析項目名2(){ return this.売上分析項目名2; }

	public void set売上分析項目名2(String 売上分析項目名2){ this.売上分析項目名2 = 売上分析項目名2; }

	public String get売上分析項目コード3(){ return this.売上分析項目コード3; }

	public void set売上分析項目コード3(String 売上分析項目コード3){ this.売上分析項目コード3 = 売上分析項目コード3; }

	public String get売上分析項目名3(){ return this.売上分析項目名3; }

	public void set売上分析項目名3(String 売上分析項目名3){ this.売上分析項目名3 = 売上分析項目名3; }

	public String get売上分析項目コード4(){ return this.売上分析項目コード4; }

	public void set売上分析項目コード4(String 売上分析項目コード4){ this.売上分析項目コード4 = 売上分析項目コード4; }

	public String get売上分析項目名4(){ return this.売上分析項目名4; }

	public void set売上分析項目名4(String 売上分析項目名4){ this.売上分析項目名4 = 売上分析項目名4; }

	public String get売上分析項目コード5(){ return this.売上分析項目コード5; }

	public void set売上分析項目コード5(String 売上分析項目コード5){ this.売上分析項目コード5 = 売上分析項目コード5; }

	public String get売上分析項目名5(){ return this.売上分析項目名5; }

	public void set売上分析項目名5(String 売上分析項目名5){ this.売上分析項目名5 = 売上分析項目名5; }

	public String get売上分析項目コード6(){ return this.売上分析項目コード6; }

	public void set売上分析項目コード6(String 売上分析項目コード6){ this.売上分析項目コード6 = 売上分析項目コード6; }

	public String get売上分析項目名6(){ return this.売上分析項目名6; }

	public void set売上分析項目名6(String 売上分析項目名6){ this.売上分析項目名6 = 売上分析項目名6; }

	public String get売上分析項目コード7(){ return this.売上分析項目コード7; }

	public void set売上分析項目コード7(String 売上分析項目コード7){ this.売上分析項目コード7 = 売上分析項目コード7; }

	public String get売上分析項目名7(){ return this.売上分析項目名7; }

	public void set売上分析項目名7(String 売上分析項目名7){ this.売上分析項目名7 = 売上分析項目名7; }

	public String get売上分析項目コード8(){ return this.売上分析項目コード8; }

	public void set売上分析項目コード8(String 売上分析項目コード8){ this.売上分析項目コード8 = 売上分析項目コード8; }

	public String get売上分析項目名8(){ return this.売上分析項目名8; }

	public void set売上分析項目名8(String 売上分析項目名8){ this.売上分析項目名8 = 売上分析項目名8; }

	public String get売上分析項目コード9(){ return this.売上分析項目コード9; }

	public void set売上分析項目コード9(String 売上分析項目コード9){ this.売上分析項目コード9 = 売上分析項目コード9; }

	public String get売上分析項目名9(){ return this.売上分析項目名9; }

	public void set売上分析項目名9(String 売上分析項目名9){ this.売上分析項目名9 = 売上分析項目名9; }

	public String get売上分析項目コード10(){ return this.売上分析項目コード10; }

	public void set売上分析項目コード10(String 売上分析項目コード10){ this.売上分析項目コード10 = 売上分析項目コード10; }

	public String get売上分析項目名10(){ return this.売上分析項目名10; }

	public void set売上分析項目名10(String 売上分析項目名10){ this.売上分析項目名10 = 売上分析項目名10; }

	public String get金額後報(){ return this.金額後報; }

	public void set金額後報(String 金額後報){ this.金額後報 = 金額後報; }

	public String toString(){
		StringBuffer buffer = new StringBuffer();
		buffer.append("[Ft_orderVo:");
		buffer.append(" 先行区分: ");
		buffer.append(先行区分);
		buffer.append(" 受注計画番号: ");
		buffer.append(受注計画番号);
		buffer.append(" オーダ識別区分: ");
		buffer.append(オーダ識別区分);
		buffer.append(" 受注番号: ");
		buffer.append(受注番号);
		buffer.append(" 明細番号: ");
		buffer.append(明細番号);
		buffer.append(" 明細枝番: ");
		buffer.append(明細枝番);
		buffer.append(" 受注本部コード: ");
		buffer.append(受注本部コード);
		buffer.append(" 受注事業部コード: ");
		buffer.append(受注事業部コード);
		buffer.append(" 受注部コード: ");
		buffer.append(受注部コード);
		buffer.append(" 受注グループコード: ");
		buffer.append(受注グループコード);
		buffer.append(" 受注本部名: ");
		buffer.append(受注本部名);
		buffer.append(" 受注事業部名: ");
		buffer.append(受注事業部名);
		buffer.append(" 受注部名: ");
		buffer.append(受注部名);
		buffer.append(" 受注グループ名: ");
		buffer.append(受注グループ名);
		buffer.append(" 受注担当者: ");
		buffer.append(受注担当者);
		buffer.append(" 売上本部コード: ");
		buffer.append(売上本部コード);
		buffer.append(" 売上事業部コード: ");
		buffer.append(売上事業部コード);
		buffer.append(" 売上部コード: ");
		buffer.append(売上部コード);
		buffer.append(" 売上グループコード: ");
		buffer.append(売上グループコード);
		buffer.append(" 売上本部名: ");
		buffer.append(売上本部名);
		buffer.append(" 売上事業部名: ");
		buffer.append(売上事業部名);
		buffer.append(" 売上部名: ");
		buffer.append(売上部名);
		buffer.append(" 売上グループ名: ");
		buffer.append(売上グループ名);
		buffer.append(" 売上担当者: ");
		buffer.append(売上担当者);
		buffer.append(" 得意先コード: ");
		buffer.append(得意先コード);
		buffer.append(" 得意先名: ");
		buffer.append(得意先名);
		buffer.append(" 得意先種別区分: ");
		buffer.append(得意先種別区分);
		buffer.append(" 得意先種別名: ");
		buffer.append(得意先種別名);
		buffer.append(" ユーザコード: ");
		buffer.append(ユーザコード);
		buffer.append(" ユーザ名: ");
		buffer.append(ユーザ名);
		buffer.append(" 件名: ");
		buffer.append(件名);
		buffer.append(" 注文番号: ");
		buffer.append(注文番号);
		buffer.append(" 依頼元製番: ");
		buffer.append(依頼元製番);
		buffer.append(" 取引形態: ");
		buffer.append(取引形態);
		buffer.append(" 取引形態名: ");
		buffer.append(取引形態名);
		buffer.append(" 商品コード: ");
		buffer.append(商品コード);
		buffer.append(" 商品名: ");
		buffer.append(商品名);
		buffer.append(" 商品大分類コード: ");
		buffer.append(商品大分類コード);
		buffer.append(" 商品中分類コード: ");
		buffer.append(商品中分類コード);
		buffer.append(" 商品小分類コード: ");
		buffer.append(商品小分類コード);
		buffer.append(" 商品大分類名: ");
		buffer.append(商品大分類名);
		buffer.append(" 商品中分類名: ");
		buffer.append(商品中分類名);
		buffer.append(" 商品小分類名: ");
		buffer.append(商品小分類名);
		buffer.append(" 売上金額: ");
		buffer.append(売上金額);
		buffer.append(" 開始日: ");
		buffer.append(開始日);
		buffer.append(" 納入予定日: ");
		buffer.append(納入予定日);
		buffer.append(" 検収終了予定日: ");
		buffer.append(検収終了予定日);
		buffer.append(" 検収日: ");
		buffer.append(検収日);
		buffer.append(" 完了日: ");
		buffer.append(完了日);
		buffer.append(" 自動延長対象: ");
		buffer.append(自動延長対象);
		buffer.append(" 注文書回収状況区分: ");
		buffer.append(注文書回収状況区分);
		buffer.append(" 注文書回収状況名称: ");
		buffer.append(注文書回収状況名称);
		buffer.append(" 社内売上金額: ");
		buffer.append(社内売上金額);
		buffer.append(" 受注分析項目コード1: ");
		buffer.append(受注分析項目コード1);
		buffer.append(" 受注分析項目名1: ");
		buffer.append(受注分析項目名1);
		buffer.append(" 受注分析項目コード2: ");
		buffer.append(受注分析項目コード2);
		buffer.append(" 受注分析項目名2: ");
		buffer.append(受注分析項目名2);
		buffer.append(" 受注分析項目コード3: ");
		buffer.append(受注分析項目コード3);
		buffer.append(" 受注分析項目名3: ");
		buffer.append(受注分析項目名3);
		buffer.append(" 受注分析項目コード4: ");
		buffer.append(受注分析項目コード4);
		buffer.append(" 受注分析項目名4: ");
		buffer.append(受注分析項目名4);
		buffer.append(" 受注分析項目コード5: ");
		buffer.append(受注分析項目コード5);
		buffer.append(" 受注分析項目名5: ");
		buffer.append(受注分析項目名5);
		buffer.append(" 受注分析項目コード6: ");
		buffer.append(受注分析項目コード6);
		buffer.append(" 受注分析項目名6: ");
		buffer.append(受注分析項目名6);
		buffer.append(" 受注分析項目コード7: ");
		buffer.append(受注分析項目コード7);
		buffer.append(" 受注分析項目名7: ");
		buffer.append(受注分析項目名7);
		buffer.append(" 受注分析項目コード8: ");
		buffer.append(受注分析項目コード8);
		buffer.append(" 受注分析項目名8: ");
		buffer.append(受注分析項目名8);
		buffer.append(" 受注分析項目コード9: ");
		buffer.append(受注分析項目コード9);
		buffer.append(" 受注分析項目名9: ");
		buffer.append(受注分析項目名9);
		buffer.append(" 受注分析項目コード10: ");
		buffer.append(受注分析項目コード10);
		buffer.append(" 受注分析項目名10: ");
		buffer.append(受注分析項目名10);
		buffer.append(" 売上分析項目コード1: ");
		buffer.append(売上分析項目コード1);
		buffer.append(" 売上分析項目名1: ");
		buffer.append(売上分析項目名1);
		buffer.append(" 売上分析項目コード2: ");
		buffer.append(売上分析項目コード2);
		buffer.append(" 売上分析項目名2: ");
		buffer.append(売上分析項目名2);
		buffer.append(" 売上分析項目コード3: ");
		buffer.append(売上分析項目コード3);
		buffer.append(" 売上分析項目名3: ");
		buffer.append(売上分析項目名3);
		buffer.append(" 売上分析項目コード4: ");
		buffer.append(売上分析項目コード4);
		buffer.append(" 売上分析項目名4: ");
		buffer.append(売上分析項目名4);
		buffer.append(" 売上分析項目コード5: ");
		buffer.append(売上分析項目コード5);
		buffer.append(" 売上分析項目名5: ");
		buffer.append(売上分析項目名5);
		buffer.append(" 売上分析項目コード6: ");
		buffer.append(売上分析項目コード6);
		buffer.append(" 売上分析項目名6: ");
		buffer.append(売上分析項目名6);
		buffer.append(" 売上分析項目コード7: ");
		buffer.append(売上分析項目コード7);
		buffer.append(" 売上分析項目名7: ");
		buffer.append(売上分析項目名7);
		buffer.append(" 売上分析項目コード8: ");
		buffer.append(売上分析項目コード8);
		buffer.append(" 売上分析項目名8: ");
		buffer.append(売上分析項目名8);
		buffer.append(" 売上分析項目コード9: ");
		buffer.append(売上分析項目コード9);
		buffer.append(" 売上分析項目名9: ");
		buffer.append(売上分析項目名9);
		buffer.append(" 売上分析項目コード10: ");
		buffer.append(売上分析項目コード10);
		buffer.append(" 売上分析項目名10: ");
		buffer.append(売上分析項目名10);
		buffer.append(" 金額後報: ");
		buffer.append(金額後報);
		buffer.append("]");
		return buffer.toString();
	}

}
