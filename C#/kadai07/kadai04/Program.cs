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
            SalesDetail saledetail = new SalesDetail(0, 0);
            
            Console.WriteLine("商品NO?");
            product.SetNo(Convert.ToInt32(Console.ReadLine()));
            
            Console.WriteLine("商品名？");
            product.SetName(Console.ReadLine());
            
            while (true)
            {
                Console.WriteLine("価格？");
                int price = Convert.ToInt32(Console.ReadLine());
                if (price < 0)
                {
                    Console.WriteLine("値は0以上です。");
                }
                else if (price >= 10000000)
                {
                    Console.WriteLine("値は9999999以下です");
                }
                else
                {
                    product.SetPrice(price);
                    break;
                }
            }

            while (true)
            {
                Console.WriteLine("商品NO?");
                int no = Convert.ToInt32(Console.ReadLine());
                if (product.GetNo() == no)
                {
                    saledetail.SetProductNo(no);
                    break;
                }
                else
                {
                    Console.WriteLine("商品が存在しません。");
                }
            }

            while (true)
            {
                Console.WriteLine("個数?");
                int quantity = Convert.ToInt32(Console.ReadLine());
                if (quantity < 0)
                {
                    Console.WriteLine("個数は0以上999以下です。", "エラー");
                }
                else if (quantity > 999)
                {
                    Console.WriteLine("1000以上ですが登録しますか？ Yes/No");
                    if (Console.ReadLine() == "Yes")
                    {
                        saledetail.SetQuantity(quantity); 
                        break;
                    }
                }
                else
                {
                    saledetail.SetQuantity(quantity); 
                    break;
                }
            }
            

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
    
        public int GetNo()
        {
            return no;
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