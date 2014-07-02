CREATE TABLE FT_PLANORDER 
(
  �󒍌v��ԍ� VARCHAR2(10 BYTE) NOT NULL 
, ���� VARCHAR2(120 BYTE) 
, ���Ӑ� VARCHAR2(50 BYTE) 
, ���[�U VARCHAR2(50 BYTE) 
, �󒍔ԍ� VARCHAR2(10 BYTE) 
, ���ϔԍ� VARCHAR2(10 BYTE) 
, �����ԍ� VARCHAR2(10 BYTE) 
, �葱��� VARCHAR2(20 BYTE) 
, ����\�� NUMBER(10, 0) 
, �����\�� NUMBER(10, 0) 
, ������ NUMBER(1, 3) 
, �������z�ꊇ NUMBER(10, 0) 
, ���ό����ꊇ NUMBER(10, 0) 
, �������ꊇ NUMBER(1, 3) 
, �������z���z NUMBER(10, 0) 
, ���ό������z NUMBER(10, 0) 
, ���������z NUMBER(1, 3) 
, �������z�N�z NUMBER(10, 0) 
, ���ό����N�z NUMBER(10, 0) 
, �������N�z NUMBER(1, 3) 
, �������z���� NUMBER(10, 0) 
, ���ό������� NUMBER(10, 0) 
, ���������� NUMBER(1, 3) 
, �󒍗\����t DATE 
, ��s VARCHAR2(5 BYTE) 
, �󒍃����N VARCHAR2(3 BYTE) 
, �󒍒S�� VARCHAR2(50 BYTE) 
, ����S�� VARCHAR2(50 BYTE) 
, CONSTRAINT PK_PLANORDER PRIMARY KEY 
  (
    �󒍌v��ԍ� 
  )
  USING INDEX 
  (
      CREATE UNIQUE INDEX PK_PLANORDER ON FT_PLANORDER (�󒍌v��ԍ� ASC) 
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
