CREATE TABLE FT_WORKTIME 
(
  データ種別 VARCHAR2(30 BYTE) 
, 月度 VARCHAR2(6 BYTE) NOT NULL 
, 締日区分 VARCHAR2(20 BYTE) NOT NULL 
, 担当本部コード VARCHAR2(3 BYTE) 
, 担当事業部コード VARCHAR2(3 BYTE) 
, 担当部コード VARCHAR2(3 BYTE) 
, 担当グループコード VARCHAR2(3 BYTE) 
, 担当本部名 VARCHAR2(50 BYTE) 
, 担当事業部名 VARCHAR2(50 BYTE) 
, 担当部名 VARCHAR2(50 BYTE) 
, 担当グループ名 VARCHAR2(50 BYTE) 
, オーダ識別区分 VARCHAR2(1 BYTE) NOT NULL 
, 受注番号 VARCHAR2(10 BYTE) NOT NULL 
, 受注明細番号 VARCHAR2(3 BYTE) NOT NULL 
, 受注明細枝番 VARCHAR2(3 BYTE) NOT NULL 
, 得意先コード VARCHAR2(10 BYTE) 
, 得意先名 VARCHAR2(50 BYTE) 
, ユーザコード VARCHAR2(10 BYTE) 
, ユーザ名 VARCHAR2(50 BYTE) 
, 件名 VARCHAR2(120 BYTE) 
, 商品名 VARCHAR2(30 BYTE) 
, 本部コード VARCHAR2(3 BYTE) 
, 事業部コード VARCHAR2(3 BYTE) 
, 部コード VARCHAR2(3 BYTE) 
, グループコード VARCHAR2(3 BYTE) 
, 本部名 VARCHAR2(50 BYTE) 
, 事業部名 VARCHAR2(50 BYTE) 
, 部名 VARCHAR2(50 BYTE) 
, グループ名 VARCHAR2(50 BYTE) 
, 作業者コード VARCHAR2(10 BYTE) NOT NULL 
, 作業者名 VARCHAR2(50 BYTE) 
, 役職コード VARCHAR2(3 BYTE) 
, 役職名 VARCHAR2(30 BYTE) 
, スピリットフラグ VARCHAR2(3 BYTE) 
, 作業区分 VARCHAR2(5 BYTE) 
, キャリア名 VARCHAR2(20 BYTE) 
, エキスパート区分 VARCHAR2(5 BYTE) 
, 二十日迄工数 NUMBER(4, 1) 
, 二十日以降工数 NUMBER(4, 1) 
, 月度計工数 NUMBER(4, 1) 
, 原価対象旅費 NUMBER(8, 1) 
, CONSTRAINT PK_WORKTIME PRIMARY KEY 
  (
    月度 
  , 締日区分 
  , オーダ識別区分 
  , 受注番号 
  , 受注明細番号 
  , 受注明細枝番 
  , 作業者コード 
  )
  USING INDEX 
  (
      CREATE UNIQUE INDEX PK_WORKTIME ON FT_WORKTIME (月度 ASC, 締日区分 ASC, オーダ識別区分 ASC, 受注番号 ASC, 受注明細番号 ASC, 受注明細枝番 ASC, 作業者コード ASC) 
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
