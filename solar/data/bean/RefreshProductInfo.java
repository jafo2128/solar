/*  1:   */ package cn.com.voltronic.solar.data.bean;
/*  2:   */ 
/*  3:   */ import javax.swing.JTextField;
/*  4:   */ 
/*  5:   */ public class RefreshProductInfo
/*  6:   */ {
/*  7:   */   private JTextField textField;
/*  8:   */   private String value;
/*  9:   */   
/* 10:   */   public RefreshProductInfo(JTextField textField, String value)
/* 11:   */   {
/* 12:16 */     this.textField = textField;
/* 13:17 */     this.value = value;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public JTextField getTextField()
/* 17:   */   {
/* 18:21 */     return this.textField;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void setTextField(JTextField textField)
/* 22:   */   {
/* 23:25 */     this.textField = textField;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public String getValue()
/* 27:   */   {
/* 28:29 */     return this.value;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void setValue(String value)
/* 32:   */   {
/* 33:33 */     this.value = value;
/* 34:   */   }
/* 35:   */ }


/* Location:           F:\tmp\wp\
 * Qualified Name:     cn.com.voltronic.solar.data.bean.RefreshProductInfo
 * JD-Core Version:    0.7.0.1
 */