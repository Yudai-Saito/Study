using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Kadai04
{
    class Hoge
    {
        public static void Main(String[] args)
        {
            Product product = new Product();

            Console.WriteLine("商品NO?");
            product.SetNo(Convert.ToInt32(Console.ReadLine()));
            
            Console.WriteLine("商品名？");
            product.SetName(Console.ReadLine());
            
            Console.WriteLine("価格");
            product.SetPrice(Convert.ToInt32(Console.ReadLine()));


            Console.WriteLine("商品NO?");
            int no = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("個数?");
            int quantity = Convert.ToInt32(Console.ReadLine());
            
            SalesDetail saledetail = new SalesDetail(no, quantity);

            Console.WriteLine("販売価格");
            Console.WriteLine(product.GerPrice() * saledetail.GetQuantity());
        }
    }

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