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

    class ProductManager
    {
        private Dictionary<int, Product> ProductDict = new Dictionary<int, Product>();

        public ProductManager()
        {

        }
        
        public void SetProduct(Product product)
        {
            this.ProductDict.Add(product.GetNo(), product);
        }

        public Product GetProduct(int no)
        {
            return this.ProductDict[no];
        }

        public void DeleteProduct(int no)
        {
            this.ProductDict.Remove(no);
        }

        public Dictionary<int, Product> GetAllProduct()
        {
            return this.ProductDict; 
        }
    }

    class SalesDetailManager
    {
        private Dictionary<int, SalesDetail> SalesDetailDict = new Dictionary<int, SalesDetail>();
        
        public SalesDetailManager()
        {

        }

        public void SetSalesDetail(SalesDetail salesDetail)
        {
            int no = this.SalesDetailDict.Count;

            this.SalesDetailDict.Add(no, salesDetail);
        }

        public SalesDetail GetSalesDetail(int no)
        {
            return this.SalesDetailDict[no];
        }

        public void DeleteSalesDetail(int no)
        {
            this.SalesDetailDict.Remove(no);  
        }

        public Dictionary<int, SalesDetail> GetAllsalesDetail()
        {
            return this.SalesDetailDict;
        }
    }

    class SalesManager
    {
        private Dictionary<int, Sales> SalesDict = new Dictionary<int, Sales>();

        public SalesManager()
        {

        }
        
        public void SetSales(Sales sales)
        {
            int no = this.SalesDict.Count;

            this.SalesDict.Add(no, sales);
        }

        public Sales GetSales(int no)
        {
            return this.SalesDict[no];
        }

        public void DeleteSales(int no)
        {
            this.SalesDict.Remove(no);
        }

        public Dictionary<int, Sales> GetAllSales()
        {
            return SalesDict;
        }
    }
}
