/* Code Generator Information.
 * generator Version 1.0.0 release 2007/10/10
 * generated Date Mon Aug 18 14:52:08 JST 2014
 */
import java.io.Serializable;

/**
 * Ft_supplyorderVo.
 * @author cypher256
 * @version 1.0 
 * history 
 * Symbol	Date		Person		Note
 * [1]		2014/08/18	cypher256		Generated.
 */
public class Ft_supplyorderVo implements Serializable{

	public static final String TABLE = "FT_SUPPLYORDER";

	/**
	 * 受注計画番号:varchar2(10)
	 */
	private String 受注計画番号;

	/**
	 * オーダ識別区分:varchar2(1)
	 */
	private String オーダ識別区分;

	/**
	 * 受注番号:varchar2(10)
	 */
	private String 受注番号;

	/**
	 * 受注明細番号:varchar2(3)
	 */
	private String 受注明細番号;

	/**
	 * 受注明細枝番:varchar2(3)
	 */
	private String 受注明細枝番;

	/**
	 * 売上ランク区分:varchar2(3)
	 */
	private String 売上ランク区分;

	/**
	 * 発注番号:varchar2(10) <Primary Key>
	 */
	private String 発注番号;

	/**
	 * 発注版数:varchar2(3) <Primary Key>
	 */
	private String 発注版数;

	/**
	 * 発注計画番号:varchar2(10)
	 */
	private String 発注計画番号;

	/**
	 * 発注区分:varchar2(3)
	 */
	private String 発注区分;

	/**
	 * 発注区分名:varchar2(20)
	 */
	private String 発注区分名;

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
	 * 発注担当者コード:varchar2(10)
	 */
	private String 発注担当者コード;

	/**
	 * 発注担当者名:varchar2(50)
	 */
	private String 発注担当者名;

	/**
	 * 協力会社コード:varchar2(10)
	 */
	private String 協力会社コード;

	/**
	 * 協力会社名:varchar2(50)
	 */
	private String 協力会社名;

	/**
	 * 協力会社部署コード:varchar2(10)
	 */
	private String 協力会社部署コード;

	/**
	 * 協力会社部署名:varchar2(50)
	 */
	private String 協力会社部署名;

	/**
	 * ユーザコード:varchar2(10)
	 */
	private String ユーザコード;

	/**
	 * ユーザ名:varchar2(50)
	 */
	private String ユーザ名;

	/**
	 * 発注件名:varchar2(120)
	 */
	private String 発注件名;

	/**
	 * 初回見積依頼日:date(0)
	 */
	private java.sql.Timestamp 初回見積依頼日;

	/**
	 * 見積依頼日:date(0)
	 */
	private java.sql.Timestamp 見積依頼日;

	/**
	 * 発注日:date(0)
	 */
	private java.sql.Timestamp 発注日;

	/**
	 * 開始予定日:date(0)
	 */
	private java.sql.Timestamp 開始予定日;

	/**
	 * 入荷予定日:date(0)
	 */
	private java.sql.Timestamp 入荷予定日;

	/**
	 * 検収予定日:date(0)
	 */
	private java.sql.Timestamp 検収予定日;

	/**
	 * 発注理由区分:varchar2(3)
	 */
	private String 発注理由区分;

	/**
	 * 発注理由:varchar2(30)
	 */
	private String 発注理由;

	/**
	 * 発注理由備考:varchar2(120)
	 */
	private String 発注理由備考;

	/**
	 * 開示状況区分:varchar2(3)
	 */
	private String 開示状況区分;

	/**
	 * 開示状況:varchar2(30)
	 */
	private String 開示状況;

	/**
	 * 開示状況備考:varchar2(120)
	 */
	private String 開示状況備考;

	/**
	 * 相見積状況区分:varchar2(3)
	 */
	private String 相見積状況区分;

	/**
	 * 相見積状況:varchar2(30)
	 */
	private String 相見積状況;

	/**
	 * 相見積状況備考:varchar2(120)
	 */
	private String 相見積状況備考;

	/**
	 * 選定理由区分:varchar2(3)
	 */
	private String 選定理由区分;

	/**
	 * 選定理由:varchar2(30)
	 */
	private String 選定理由;

	/**
	 * 選定理由備考:varchar2(120)
	 */
	private String 選定理由備考;

	/**
	 * 発注金額:number(10)
	 */
	private java.math.BigDecimal 発注金額;

	/**
	 * 手続き状態区分:varchar2(3)
	 */
	private String 手続き状態区分;

	/**
	 * 手続状態区分名:varchar2(30)
	 */
	private String 手続状態区分名;

	/**
	 * 小額:number(10)
	 */
	private java.math.BigDecimal 小額;

	/**
	 * 特化:varchar2(30)
	 */
	private String 特化;

	/**
	 * 見積区分:varchar2(20)
	 */
	private String 見積区分;

	/**
	 * プロジェクト番号:varchar2(20)
	 */
	private String プロジェクト番号;

	/**
	 * プロジェクト名:varchar2(120)
	 */
	private String プロジェクト名;

	/**
	* Constractor
	*/
	public Ft_supplyorderVo(){}

	/**
	* Constractor
	* @param <code>発注番号</code>
	* @param <code>発注版数</code>
	*/
	public Ft_supplyorderVo(String 発注番号, String 発注版数){
		this.発注番号 = 発注番号;
		this.発注版数 = 発注版数;
	}

	public String get受注計画番号(){ return this.受注計画番号; }

	public void set受注計画番号(String 受注計画番号){ this.受注計画番号 = 受注計画番号; }

	public String getオーダ識別区分(){ return this.オーダ識別区分; }

	public void setオーダ識別区分(String オーダ識別区分){ this.オーダ識別区分 = オーダ識別区分; }

	public String get受注番号(){ return this.受注番号; }

	public void set受注番号(String 受注番号){ this.受注番号 = 受注番号; }

	public String get受注明細番号(){ return this.受注明細番号; }

	public void set受注明細番号(String 受注明細番号){ this.受注明細番号 = 受注明細番号; }

	public String get受注明細枝番(){ return this.受注明細枝番; }

	public void set受注明細枝番(String 受注明細枝番){ this.受注明細枝番 = 受注明細枝番; }

	public String get売上ランク区分(){ return this.売上ランク区分; }

	public void set売上ランク区分(String 売上ランク区分){ this.売上ランク区分 = 売上ランク区分; }

	public String get発注番号(){ return this.発注番号; }

	public void set発注番号(String 発注番号){ this.発注番号 = 発注番号; }

	public String get発注版数(){ return this.発注版数; }

	public void set発注版数(String 発注版数){ this.発注版数 = 発注版数; }

	public String get発注計画番号(){ return this.発注計画番号; }

	public void set発注計画番号(String 発注計画番号){ this.発注計画番号 = 発注計画番号; }

	public String get発注区分(){ return this.発注区分; }

	public void set発注区分(String 発注区分){ this.発注区分 = 発注区分; }

	public String get発注区分名(){ return this.発注区分名; }

	public void set発注区分名(String 発注区分名){ this.発注区分名 = 発注区分名; }

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

	public String get発注担当者コード(){ return this.発注担当者コード; }

	public void set発注担当者コード(String 発注担当者コード){ this.発注担当者コード = 発注担当者コード; }

	public String get発注担当者名(){ return this.発注担当者名; }

	public void set発注担当者名(String 発注担当者名){ this.発注担当者名 = 発注担当者名; }

	public String get協力会社コード(){ return this.協力会社コード; }

	public void set協力会社コード(String 協力会社コード){ this.協力会社コード = 協力会社コード; }

	public String get協力会社名(){ return this.協力会社名; }

	public void set協力会社名(String 協力会社名){ this.協力会社名 = 協力会社名; }

	public String get協力会社部署コード(){ return this.協力会社部署コード; }

	public void set協力会社部署コード(String 協力会社部署コード){ this.協力会社部署コード = 協力会社部署コード; }

	public String get協力会社部署名(){ return this.協力会社部署名; }

	public void set協力会社部署名(String 協力会社部署名){ this.協力会社部署名 = 協力会社部署名; }

	public String getユーザコード(){ return this.ユーザコード; }

	public void setユーザコード(String ユーザコード){ this.ユーザコード = ユーザコード; }

	public String getユーザ名(){ return this.ユーザ名; }

	public void setユーザ名(String ユーザ名){ this.ユーザ名 = ユーザ名; }

	public String get発注件名(){ return this.発注件名; }

	public void set発注件名(String 発注件名){ this.発注件名 = 発注件名; }

	public java.sql.Timestamp get初回見積依頼日(){ return this.初回見積依頼日; }

	public void set初回見積依頼日(java.sql.Timestamp 初回見積依頼日){ this.初回見積依頼日 = 初回見積依頼日; }

	public java.sql.Timestamp get見積依頼日(){ return this.見積依頼日; }

	public void set見積依頼日(java.sql.Timestamp 見積依頼日){ this.見積依頼日 = 見積依頼日; }

	public java.sql.Timestamp get発注日(){ return this.発注日; }

	public void set発注日(java.sql.Timestamp 発注日){ this.発注日 = 発注日; }

	public java.sql.Timestamp get開始予定日(){ return this.開始予定日; }

	public void set開始予定日(java.sql.Timestamp 開始予定日){ this.開始予定日 = 開始予定日; }

	public java.sql.Timestamp get入荷予定日(){ return this.入荷予定日; }

	public void set入荷予定日(java.sql.Timestamp 入荷予定日){ this.入荷予定日 = 入荷予定日; }

	public java.sql.Timestamp get検収予定日(){ return this.検収予定日; }

	public void set検収予定日(java.sql.Timestamp 検収予定日){ this.検収予定日 = 検収予定日; }

	public String get発注理由区分(){ return this.発注理由区分; }

	public void set発注理由区分(String 発注理由区分){ this.発注理由区分 = 発注理由区分; }

	public String get発注理由(){ return this.発注理由; }

	public void set発注理由(String 発注理由){ this.発注理由 = 発注理由; }

	public String get発注理由備考(){ return this.発注理由備考; }

	public void set発注理由備考(String 発注理由備考){ this.発注理由備考 = 発注理由備考; }

	public String get開示状況区分(){ return this.開示状況区分; }

	public void set開示状況区分(String 開示状況区分){ this.開示状況区分 = 開示状況区分; }

	public String get開示状況(){ return this.開示状況; }

	public void set開示状況(String 開示状況){ this.開示状況 = 開示状況; }

	public String get開示状況備考(){ return this.開示状況備考; }

	public void set開示状況備考(String 開示状況備考){ this.開示状況備考 = 開示状況備考; }

	public String get相見積状況区分(){ return this.相見積状況区分; }

	public void set相見積状況区分(String 相見積状況区分){ this.相見積状況区分 = 相見積状況区分; }

	public String get相見積状況(){ return this.相見積状況; }

	public void set相見積状況(String 相見積状況){ this.相見積状況 = 相見積状況; }

	public String get相見積状況備考(){ return this.相見積状況備考; }

	public void set相見積状況備考(String 相見積状況備考){ this.相見積状況備考 = 相見積状況備考; }

	public String get選定理由区分(){ return this.選定理由区分; }

	public void set選定理由区分(String 選定理由区分){ this.選定理由区分 = 選定理由区分; }

	public String get選定理由(){ return this.選定理由; }

	public void set選定理由(String 選定理由){ this.選定理由 = 選定理由; }

	public String get選定理由備考(){ return this.選定理由備考; }

	public void set選定理由備考(String 選定理由備考){ this.選定理由備考 = 選定理由備考; }

	public java.math.BigDecimal get発注金額(){ return this.発注金額; }

	public void set発注金額(java.math.BigDecimal 発注金額){ this.発注金額 = 発注金額; }

	public String get手続き状態区分(){ return this.手続き状態区分; }

	public void set手続き状態区分(String 手続き状態区分){ this.手続き状態区分 = 手続き状態区分; }

	public String get手続状態区分名(){ return this.手続状態区分名; }

	public void set手続状態区分名(String 手続状態区分名){ this.手続状態区分名 = 手続状態区分名; }

	public java.math.BigDecimal get小額(){ return this.小額; }

	public void set小額(java.math.BigDecimal 小額){ this.小額 = 小額; }

	public String get特化(){ return this.特化; }

	public void set特化(String 特化){ this.特化 = 特化; }

	public String get見積区分(){ return this.見積区分; }

	public void set見積区分(String 見積区分){ this.見積区分 = 見積区分; }

	public String getプロジェクト番号(){ return this.プロジェクト番号; }

	public void setプロジェクト番号(String プロジェクト番号){ this.プロジェクト番号 = プロジェクト番号; }

	public String getプロジェクト名(){ return this.プロジェクト名; }

	public void setプロジェクト名(String プロジェクト名){ this.プロジェクト名 = プロジェクト名; }

	public String toString(){
		StringBuffer buffer = new StringBuffer();
		buffer.append("[Ft_supplyorderVo:");
		buffer.append(" 受注計画番号: ");
		buffer.append(受注計画番号);
		buffer.append(" オーダ識別区分: ");
		buffer.append(オーダ識別区分);
		buffer.append(" 受注番号: ");
		buffer.append(受注番号);
		buffer.append(" 受注明細番号: ");
		buffer.append(受注明細番号);
		buffer.append(" 受注明細枝番: ");
		buffer.append(受注明細枝番);
		buffer.append(" 売上ランク区分: ");
		buffer.append(売上ランク区分);
		buffer.append(" 発注番号: ");
		buffer.append(発注番号);
		buffer.append(" 発注版数: ");
		buffer.append(発注版数);
		buffer.append(" 発注計画番号: ");
		buffer.append(発注計画番号);
		buffer.append(" 発注区分: ");
		buffer.append(発注区分);
		buffer.append(" 発注区分名: ");
		buffer.append(発注区分名);
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
		buffer.append(" 発注担当者コード: ");
		buffer.append(発注担当者コード);
		buffer.append(" 発注担当者名: ");
		buffer.append(発注担当者名);
		buffer.append(" 協力会社コード: ");
		buffer.append(協力会社コード);
		buffer.append(" 協力会社名: ");
		buffer.append(協力会社名);
		buffer.append(" 協力会社部署コード: ");
		buffer.append(協力会社部署コード);
		buffer.append(" 協力会社部署名: ");
		buffer.append(協力会社部署名);
		buffer.append(" ユーザコード: ");
		buffer.append(ユーザコード);
		buffer.append(" ユーザ名: ");
		buffer.append(ユーザ名);
		buffer.append(" 発注件名: ");
		buffer.append(発注件名);
		buffer.append(" 初回見積依頼日: ");
		buffer.append(初回見積依頼日);
		buffer.append(" 見積依頼日: ");
		buffer.append(見積依頼日);
		buffer.append(" 発注日: ");
		buffer.append(発注日);
		buffer.append(" 開始予定日: ");
		buffer.append(開始予定日);
		buffer.append(" 入荷予定日: ");
		buffer.append(入荷予定日);
		buffer.append(" 検収予定日: ");
		buffer.append(検収予定日);
		buffer.append(" 発注理由区分: ");
		buffer.append(発注理由区分);
		buffer.append(" 発注理由: ");
		buffer.append(発注理由);
		buffer.append(" 発注理由備考: ");
		buffer.append(発注理由備考);
		buffer.append(" 開示状況区分: ");
		buffer.append(開示状況区分);
		buffer.append(" 開示状況: ");
		buffer.append(開示状況);
		buffer.append(" 開示状況備考: ");
		buffer.append(開示状況備考);
		buffer.append(" 相見積状況区分: ");
		buffer.append(相見積状況区分);
		buffer.append(" 相見積状況: ");
		buffer.append(相見積状況);
		buffer.append(" 相見積状況備考: ");
		buffer.append(相見積状況備考);
		buffer.append(" 選定理由区分: ");
		buffer.append(選定理由区分);
		buffer.append(" 選定理由: ");
		buffer.append(選定理由);
		buffer.append(" 選定理由備考: ");
		buffer.append(選定理由備考);
		buffer.append(" 発注金額: ");
		buffer.append(発注金額);
		buffer.append(" 手続き状態区分: ");
		buffer.append(手続き状態区分);
		buffer.append(" 手続状態区分名: ");
		buffer.append(手続状態区分名);
		buffer.append(" 小額: ");
		buffer.append(小額);
		buffer.append(" 特化: ");
		buffer.append(特化);
		buffer.append(" 見積区分: ");
		buffer.append(見積区分);
		buffer.append(" プロジェクト番号: ");
		buffer.append(プロジェクト番号);
		buffer.append(" プロジェクト名: ");
		buffer.append(プロジェクト名);
		buffer.append("]");
		return buffer.toString();
	}

}
