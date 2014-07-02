CREATE TABLE FT_WORKTIME 
(
  �f�[�^��� VARCHAR2(30 BYTE) 
, ���x VARCHAR2(6 BYTE) NOT NULL 
, �����敪 VARCHAR2(20 BYTE) NOT NULL 
, �S���{���R�[�h VARCHAR2(3 BYTE) 
, �S�����ƕ��R�[�h VARCHAR2(3 BYTE) 
, �S�����R�[�h VARCHAR2(3 BYTE) 
, �S���O���[�v�R�[�h VARCHAR2(3 BYTE) 
, �S���{���� VARCHAR2(50 BYTE) 
, �S�����ƕ��� VARCHAR2(50 BYTE) 
, �S������ VARCHAR2(50 BYTE) 
, �S���O���[�v�� VARCHAR2(50 BYTE) 
, �I�[�_���ʋ敪 VARCHAR2(1 BYTE) NOT NULL 
, �󒍔ԍ� VARCHAR2(10 BYTE) NOT NULL 
, �󒍖��הԍ� VARCHAR2(3 BYTE) NOT NULL 
, �󒍖��׎}�� VARCHAR2(3 BYTE) NOT NULL 
, ���Ӑ�R�[�h VARCHAR2(10 BYTE) 
, ���Ӑ於 VARCHAR2(50 BYTE) 
, ���[�U�R�[�h VARCHAR2(10 BYTE) 
, ���[�U�� VARCHAR2(50 BYTE) 
, ���� VARCHAR2(120 BYTE) 
, ���i�� VARCHAR2(30 BYTE) 
, �{���R�[�h VARCHAR2(3 BYTE) 
, ���ƕ��R�[�h VARCHAR2(3 BYTE) 
, ���R�[�h VARCHAR2(3 BYTE) 
, �O���[�v�R�[�h VARCHAR2(3 BYTE) 
, �{���� VARCHAR2(50 BYTE) 
, ���ƕ��� VARCHAR2(50 BYTE) 
, ���� VARCHAR2(50 BYTE) 
, �O���[�v�� VARCHAR2(50 BYTE) 
, ��Ǝ҃R�[�h VARCHAR2(10 BYTE) NOT NULL 
, ��ƎҖ� VARCHAR2(50 BYTE) 
, ��E�R�[�h VARCHAR2(3 BYTE) 
, ��E�� VARCHAR2(30 BYTE) 
, �X�s���b�g�t���O VARCHAR2(3 BYTE) 
, ��Ƌ敪 VARCHAR2(5 BYTE) 
, �L�����A�� VARCHAR2(20 BYTE) 
, �G�L�X�p�[�g�敪 VARCHAR2(5 BYTE) 
, ��\�����H�� NUMBER(4, 1) 
, ��\���ȍ~�H�� NUMBER(4, 1) 
, ���x�v�H�� NUMBER(4, 1) 
, �����Ώۗ��� NUMBER(8, 1) 
, CONSTRAINT PK_WORKTIME PRIMARY KEY 
  (
    ���x 
  , �����敪 
  , �I�[�_���ʋ敪 
  , �󒍔ԍ� 
  , �󒍖��הԍ� 
  , �󒍖��׎}�� 
  , ��Ǝ҃R�[�h 
  )
  USING INDEX 
  (
      CREATE UNIQUE INDEX PK_WORKTIME ON FT_WORKTIME (���x ASC, �����敪 ASC, �I�[�_���ʋ敪 ASC, �󒍔ԍ� ASC, �󒍖��הԍ� ASC, �󒍖��׎}�� ASC, ��Ǝ҃R�[�h ASC) 
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
