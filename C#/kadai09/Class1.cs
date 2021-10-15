using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GuiApp02
{
    class Class1
    { 
        string param;
        public string GetParam()
        {

            return param;
        }

        public void SteParam(String value)
        {
            param = value;
        }
    }
}

namespace Kadai
{
    class Product
    {
        int no;
        string name;
        long price;

        public Product()
        {

        }

        public void SetNo(int no)
        {
            this.no = no;
        }

        public void SetName(string name)
        {
            this.name = name;
        }

        public void SetPrice(long price)
        {
            this.price = price;
        }

        public int GetNo()
        {
            return no;
        }

        public string GetName()
        {
            return this.name;
        }

        public long GerPrice()
        {
            return this.price;
        }

    }

    class SalesDetail
    {
        private int salesDatailNo;
        private int productNo;
        private int quanity;

        public SalesDetail()
        {
            
        }

        public int GetSalesDetailNo()
        {
            return salesDatailNo;
        }

        public void SetSaleDetailNo(int salesDetailNo)
        {
            this.salesDatailNo = salesDetailNo;
        }
        
        public int GetProductNo()
        {
            return this.productNo;
        }

        public void SetProductNo(int productNo)
        {
            this.productNo = productNo;
        }

        public int GetQuantity()
        {
            return this.quanity;
        }

        public void SetQuantity(int quantity)
        {
            this.quanity = quantity;
        }
    }

    class Sales
    {
        private int salesNo;
        private int[] salesDetailNoArray;

        public Sales()
        {

        }

        public int GetSalesNo()
        {
            return this.salesNo;
        }

        public void SetSalesNo(int salesNo)
        {
            this.salesNo = salesNo;
        }

        public int[] GetSalesDetailNoArray()
        {
            return this.salesDetailNoArray;
        }

        public void SetSalesDetailNoArray(int [] salesDetailNoArray)
        {
            this.salesDetailNoArray = salesDetailNoArray;
        }
    }
}
