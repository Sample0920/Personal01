CREATE TABLE FT_SUPPLYORDER 
(
  �󒍌v��ԍ� VARCHAR2(10 BYTE) 
, �I�[�_���ʋ敪 VARCHAR2(1 BYTE) 
, �󒍔ԍ� VARCHAR2(10 BYTE) 
, �󒍖��הԍ� VARCHAR2(3 BYTE) 
, �󒍖��׎}�� VARCHAR2(3 BYTE) 
, ���ド���N�敪 VARCHAR2(3 BYTE) 
, �����ԍ� VARCHAR2(10 BYTE) NOT NULL 
, �����Ő� VARCHAR2(3 BYTE) NOT NULL 
, �����v��ԍ� VARCHAR2(10 BYTE) 
, �����敪 VARCHAR2(3 BYTE) 
, �����敪�� VARCHAR2(20 BYTE) 
, �{���R�[�h VARCHAR2(3 BYTE) 
, ���ƕ��R�[�h VARCHAR2(3 BYTE) 
, ���R�[�h VARCHAR2(3 BYTE) 
, �O���[�v�R�[�h VARCHAR2(3 BYTE) 
, �{���� VARCHAR2(50 BYTE) 
, ���ƕ��� VARCHAR2(50 BYTE) 
, ���� VARCHAR2(50 BYTE) 
, �O���[�v�� VARCHAR2(50 BYTE) 
, �����S���҃R�[�h VARCHAR2(10 BYTE) 
, �����S���Җ� VARCHAR2(50 BYTE) 
, ���͉�ЃR�[�h VARCHAR2(10 BYTE) 
, ���͉�Ж� VARCHAR2(50 BYTE) 
, ���͉�Е����R�[�h VARCHAR2(10 BYTE) 
, ���͉�Е����� VARCHAR2(50 BYTE) 
, ���[�U�R�[�h VARCHAR2(10 BYTE) 
, ���[�U�� VARCHAR2(50 BYTE) 
, �������� VARCHAR2(120 BYTE) 
, ���񌩐ψ˗��� DATE 
, ���ψ˗��� DATE 
, ������ DATE 
, �J�n�\��� DATE 
, ���ח\��� DATE 
, �����\��� DATE 
, �������R�敪 VARCHAR2(3 BYTE) 
, �������R VARCHAR2(30 BYTE) 
, �������R���l VARCHAR2(120 BYTE) 
, �J���󋵋敪 VARCHAR2(3 BYTE) 
, �J���� VARCHAR2(30 BYTE) 
, �J���󋵔��l VARCHAR2(120 BYTE) 
, �����Ϗ󋵋敪 VARCHAR2(3 BYTE) 
, �����Ϗ� VARCHAR2(30 BYTE) 
, �����Ϗ󋵔��l VARCHAR2(120 BYTE) 
, �I�藝�R�敪 VARCHAR2(3 BYTE) 
, �I�藝�R VARCHAR2(30 BYTE) 
, �I�藝�R���l VARCHAR2(120 BYTE) 
, �������z NUMBER(10, 0) 
, �葱����ԋ敪 VARCHAR2(3 BYTE) 
, �葱��ԋ敪�� VARCHAR2(30 BYTE) 
, ���z NUMBER(10, 0) 
, ���� VARCHAR2(30 BYTE) 
, ���ϋ敪 VARCHAR2(20 BYTE) 
, �v���W�F�N�g�ԍ� VARCHAR2(20 BYTE) 
, �v���W�F�N�g�� VARCHAR2(120 BYTE) 
, CONSTRAINT PK_SUPPLYORDER PRIMARY KEY 
  (
    �����ԍ� 
  , �����Ő� 
  )
  USING INDEX 
  (
      CREATE UNIQUE INDEX PK_SUPPLYORDER ON FT_SUPPLYORDER (�����ԍ� ASC, �����Ő� ASC) 
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
