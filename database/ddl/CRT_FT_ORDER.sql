CREATE TABLE FT_ORDER 
(
  先行区分 VARCHAR2(5 BYTE) 
, 受注計画番号 VARCHAR2(10 BYTE) 
, オーダ識別区分 VARCHAR2(1 BYTE) NOT NULL 
, 受注番号 VARCHAR2(10 BYTE) NOT NULL 
, 明細番号 VARCHAR2(3 BYTE) NOT NULL 
, 明細枝番 VARCHAR2(3 BYTE) NOT NULL 
, 受注本部コード VARCHAR2(3 BYTE) 
, 受注事業部コード VARCHAR2(3 BYTE) 
, 受注部コード VARCHAR2(3 BYTE) 
, 受注グループコード VARCHAR2(3 BYTE) 
, 受注本部名 VARCHAR2(50 BYTE) 
, 受注事業部名 VARCHAR2(50 BYTE) 
, 受注部名 VARCHAR2(50 BYTE) 
, 受注グループ名 VARCHAR2(50 BYTE) 
, 受注担当者 VARCHAR2(30 BYTE) 
, 売上本部コード VARCHAR2(3 BYTE) 
, 売上事業部コード VARCHAR2(3 BYTE) 
, 売上部コード VARCHAR2(3 BYTE) 
, 売上グループコード VARCHAR2(3 BYTE) 
, 売上本部名 VARCHAR2(50 BYTE) 
, 売上事業部名 VARCHAR2(50 BYTE) 
, 売上部名 VARCHAR2(50 BYTE) 
, 売上グループ名 VARCHAR2(50 BYTE) 
, 売上担当者 VARCHAR2(30 BYTE) 
, 得意先コード VARCHAR2(10 BYTE) 
, 得意先名 VARCHAR2(50 BYTE) 
, 得意先種別区分 VARCHAR2(3 BYTE) 
, 得意先種別名 VARCHAR2(50 BYTE) 
, ユーザコード VARCHAR2(10 BYTE) 
, ユーザ名 VARCHAR2(50 BYTE) 
, 件名 VARCHAR2(120 BYTE) 
, 注文番号 VARCHAR2(10 BYTE) 
, 依頼元製番 VARCHAR2(20 BYTE) 
, 取引形態 VARCHAR2(3 BYTE) 
, 取引形態名 VARCHAR2(10 BYTE) 
, 商品コード VARCHAR2(10 BYTE) 
, 商品名 VARCHAR2(30 BYTE) 
, 商品大分類コード VARCHAR2(3 BYTE) 
, 商品中分類コード VARCHAR2(3 BYTE) 
, 商品小分類コード VARCHAR2(3 BYTE) 
, 商品大分類名 VARCHAR2(30 BYTE) 
, 商品中分類名 VARCHAR2(30 BYTE) 
, 商品小分類名 VARCHAR2(30 BYTE) 
, 売上金額 NUMBER(12, 0) 
, 開始日 DATE 
, 納入予定日 DATE 
, 検収終了予定日 DATE 
, 検収日 DATE 
, 完了日 DATE 
, 自動延長対象 VARCHAR2(4 BYTE) 
, 注文書回収状況区分 VARCHAR2(3 BYTE) 
, 注文書回収状況名称 VARCHAR2(30 BYTE) 
, 社内売上金額 NUMBER(12, 0) 
, 受注分析項目コード1 VARCHAR2(3 BYTE) 
, 受注分析項目名1 VARCHAR2(30 BYTE) 
, 受注分析項目コード2 VARCHAR2(3 BYTE) 
, 受注分析項目名2 VARCHAR2(30 BYTE) 
, 受注分析項目コード3 VARCHAR2(3 BYTE) 
, 受注分析項目名3 VARCHAR2(30 BYTE) 
, 受注分析項目コード4 VARCHAR2(3 BYTE) 
, 受注分析項目名4 VARCHAR2(30 BYTE) 
, 受注分析項目コード5 VARCHAR2(3 BYTE) 
, 受注分析項目名5 VARCHAR2(30 BYTE) 
, 受注分析項目コード6 VARCHAR2(3 BYTE) 
, 受注分析項目名6 VARCHAR2(30 BYTE) 
, 受注分析項目コード7 VARCHAR2(3 BYTE) 
, 受注分析項目名7 VARCHAR2(30 BYTE) 
, 受注分析項目コード8 VARCHAR2(3 BYTE) 
, 受注分析項目名8 VARCHAR2(30 BYTE) 
, 受注分析項目コード9 VARCHAR2(3 BYTE) 
, 受注分析項目名9 VARCHAR2(30 BYTE) 
, 受注分析項目コード10 VARCHAR2(3 BYTE) 
, 受注分析項目名10 VARCHAR2(30 BYTE) 
, 売上分析項目コード1 VARCHAR2(3 BYTE) 
, 売上分析項目名1 VARCHAR2(30 BYTE) 
, 売上分析項目コード2 VARCHAR2(3 BYTE) 
, 売上分析項目名2 VARCHAR2(30 BYTE) 
, 売上分析項目コード3 VARCHAR2(3 BYTE) 
, 売上分析項目名3 VARCHAR2(30 BYTE) 
, 売上分析項目コード4 VARCHAR2(3 BYTE) 
, 売上分析項目名4 VARCHAR2(30 BYTE) 
, 売上分析項目コード5 VARCHAR2(3 BYTE) 
, 売上分析項目名5 VARCHAR2(30 BYTE) 
, 売上分析項目コード6 VARCHAR2(3 BYTE) 
, 売上分析項目名6 VARCHAR2(30 BYTE) 
, 売上分析項目コード7 VARCHAR2(3 BYTE) 
, 売上分析項目名7 VARCHAR2(30 BYTE) 
, 売上分析項目コード8 VARCHAR2(3 BYTE) 
, 売上分析項目名8 VARCHAR2(30 BYTE) 
, 売上分析項目コード9 VARCHAR2(3 BYTE) 
, 売上分析項目名9 VARCHAR2(30 BYTE) 
, 売上分析項目コード10 VARCHAR2(3 BYTE) 
, 売上分析項目名10 VARCHAR2(30 BYTE) 
, 金額後報 VARCHAR2(3 BYTE) 
, CONSTRAINT PK_ORDER PRIMARY KEY 
  (
    オーダ識別区分 
  , 受注番号 
  , 明細番号 
  , 明細枝番 
  )
  USING INDEX 
  (
      CREATE UNIQUE INDEX PK_ORDER ON FT_ORDER (オーダ識別区分 ASC, 受注番号 ASC, 明細番号 ASC, 明細枝番 ASC) 
      LOGGING 
      TABLESPACE SYSTEM 
      PCTFREE 10 
      INITRANS 2 
      STORAGE 
      ( 
        INITIAL 65536 
        NEXT 1048576 
        MINEXTENTS 1 
        MAXEXTENTS UNLIMITED 
        FREELISTS 1 
        FREELIST GROUPS 1 
        BUFFER_POOL DEFAULT 
      ) 
      NOPARALLEL 
  )
  ENABLE 
) 
LOGGING 
TABLESPACE SYSTEM 
PCTFREE 10 
PCTUSED 40 
INITRANS 1 
STORAGE 
( 
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1 
  MAXEXTENTS UNLIMITED 
  FREELISTS 1 
  FREELIST GROUPS 1 
  BUFFER_POOL DEFAULT 
) 
NOCOMPRESS;
