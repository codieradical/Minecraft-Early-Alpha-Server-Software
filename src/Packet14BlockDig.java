/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
import java.io.IOException;

/*    */
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Packet14BlockDig
/*    */   extends Packet
/*    */ {
/*    */   public int a;
/*    */   public int b;
/*    */   public int c;
/*    */   public int d;
/*    */   public int e;

    /*    */   public Packet14BlockDig() {}

/*    */   
/*    */   public void a(DataInputStream paramDataInputStream) throws IOException {
/* 25 */     this.e = paramDataInputStream.read();
/* 26 */     this.a = paramDataInputStream.readInt();
/* 27 */     this.b = paramDataInputStream.read();
/* 28 */     this.c = paramDataInputStream.readInt();
/* 29 */     this.d = paramDataInputStream.read();
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) throws IOException {
/* 33 */     paramDataOutputStream.write(this.e);
/* 34 */     paramDataOutputStream.writeInt(this.a);
/* 35 */     paramDataOutputStream.write(this.b);
/* 36 */     paramDataOutputStream.writeInt(this.c);
/* 37 */     paramDataOutputStream.write(this.d);
/*    */   }
/*    */   
/*    */   public void a(NetClientManager paramdy) {
/* 41 */     paramdy.a(this);
/*    */   }
/*    */   
/*    */   public int getPacketSize() {
/* 45 */     return 11;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\gp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */