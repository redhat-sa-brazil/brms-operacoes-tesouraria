package com.redhat.tesouraria;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Operacao implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String mesa;
   private java.lang.String gestor;
   private java.lang.String operador;
   private java.lang.String produto;
   private java.lang.String decisaoEstrategia;
   private java.lang.String decisaoProduto;
   private java.lang.String decisaoOperador;

   public Operacao()
   {
   }

   public java.lang.String getMesa()
   {
      return this.mesa;
   }

   public void setMesa(java.lang.String mesa)
   {
      this.mesa = mesa;
   }

   public java.lang.String getGestor()
   {
      return this.gestor;
   }

   public void setGestor(java.lang.String gestor)
   {
      this.gestor = gestor;
   }

   public java.lang.String getOperador()
   {
      return this.operador;
   }

   public void setOperador(java.lang.String operador)
   {
      this.operador = operador;
   }

   public java.lang.String getProduto()
   {
      return this.produto;
   }

   public void setProduto(java.lang.String produto)
   {
      this.produto = produto;
   }

   public java.lang.String getDecisaoEstrategia()
   {
      return this.decisaoEstrategia;
   }

   public void setDecisaoEstrategia(java.lang.String decisaoEstrategia)
   {
      this.decisaoEstrategia = decisaoEstrategia;
   }

   public java.lang.String getDecisaoProduto()
   {
      return this.decisaoProduto;
   }

   public void setDecisaoProduto(java.lang.String decisaoProduto)
   {
      this.decisaoProduto = decisaoProduto;
   }

   public java.lang.String getDecisaoOperador()
   {
      return this.decisaoOperador;
   }

   public void setDecisaoOperador(java.lang.String decisaoOperador)
   {
      this.decisaoOperador = decisaoOperador;
   }

   public Operacao(java.lang.String mesa, java.lang.String gestor,
         java.lang.String operador, java.lang.String produto,
         java.lang.String decisaoEstrategia,
         java.lang.String decisaoProduto, java.lang.String decisaoOperador)
   {
      this.mesa = mesa;
      this.gestor = gestor;
      this.operador = operador;
      this.produto = produto;
      this.decisaoEstrategia = decisaoEstrategia;
      this.decisaoProduto = decisaoProduto;
      this.decisaoOperador = decisaoOperador;
   }

}