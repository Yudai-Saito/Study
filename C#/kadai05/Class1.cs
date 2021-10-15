using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Hoge
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

namespace GuiApp02
{
    namespace sales
    {
        class Product
        {
            int no;
            string name;
            int price;

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

            public void SetPrice(int price)
            {
                this.price = price;
            }

            public string GetName()
            {
                return name;
            }

            public int GerPrice()
            {
                return price;
            }

        }

        class SalesDetail
        {
            int productNo;
            int quanity;

            public SalesDetail(int productNo, int quanity)
            {
                this.productNo = productNo;
                this.quanity = quanity;
            }

            public int GetProductNo()
            {
                return productNo;
            }

            public void SetProductNo(int productNo)
            {
                this.productNo = productNo;
            }

            public int GetQuantity()
            {
                return quanity;
            }

            public void SetQuantity(int quantity)
            {
                this.quanity = quantity;
            }
        }
    }
}
