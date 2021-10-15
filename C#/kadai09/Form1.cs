using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using Kadai;

namespace GuiApp02
{
    public partial class Form1 : Form
    {


        private SalesDetail[] saledetailArray = new SalesDetail[0];
        private Product[] productsArray = new Product[0];
        private Sales sales = new Sales(); 
        private int[] saledtailNo = new int[0]; //商品情報が登録されるたびに加算
        
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Product product = new Product();
            
            long price = Convert.ToInt64(textBox3.Text);

            foreach (Product prod in this.productsArray)
            {
                if (Convert.ToInt32(textBox1.Text) == prod.GetNo())
                {
                    MessageBox.Show("既に登録されている商品です。");
                    return;
                }
            }

            if (price < 0)
            {
                MessageBox.Show("値は0以上です。", "エラー");
            }
            else if (price >= 10000000)
            {
                MessageBox.Show("値は9999999以下です。", "エラー");
            }
            else
            {
                product.SetNo(Convert.ToInt32(textBox1.Text));
                product.SetName(textBox2.Text);
                product.SetPrice(price);

                Array.Resize(ref this.productsArray, this.productsArray.Length + 1);
                this.productsArray[this.productsArray.Length - 1] = product;
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            int quantity = Convert.ToInt32(textBox5.Text);
            SalesDetail saleDetail = new SalesDetail();
        
            foreach (Product product in this.productsArray)
            {
                if (product.GetNo() == Convert.ToInt32(textBox4.Text))
                {
                    if (quantity < 0)
                    {
                        MessageBox.Show("個数は0以上999以下です。", "エラー");
                        return;
                    }
                    else if (quantity > 999)
                    {
                        MessageBoxButtons buttons = MessageBoxButtons.YesNo;
                        DialogResult result = MessageBox.Show("1000以上ですが登録しますか？", "警告", buttons);
                        if (result == DialogResult.Yes)
                        {
                            //saledetailNoの配列を１追加して、配列個数を追加。
                            Array.Resize(ref this.saledtailNo, this.saledtailNo.Length + 1);
                            this.saledtailNo[this.saledtailNo.Length - 1] = this.saledtailNo.Length;

                            saleDetail.SetSaleDetailNo(this.saledtailNo.Length);
                            saleDetail.SetProductNo(Convert.ToInt32(textBox4.Text));
                            saleDetail.SetQuantity(Convert.ToInt32(textBox5.Text));
                             
                            //SalesにsaledetailNoを追加
                            this.sales.SetSalesDetailNoArray(this.saledtailNo);
                            
                            Array.Resize(ref this.saledetailArray, this.saledetailArray.Length + 1);
                            this.saledetailArray[this.saledetailArray.Length - 1] = saleDetail;

                            return;
                        }
                    }
                    else
                    {
                        //登録処理が上と同じなので、まとめるか、登録部分のロジックを修正必要。
                        Array.Resize(ref this.saledtailNo, this.saledtailNo.Length + 1);
                        this.saledtailNo[this.saledtailNo.Length - 1] = this.saledtailNo.Length;

                        saleDetail.SetSaleDetailNo(this.saledtailNo.Length);
                        saleDetail.SetProductNo(Convert.ToInt32(textBox4.Text));
                        saleDetail.SetQuantity(Convert.ToInt32(textBox5.Text));

                        this.sales.SetSalesDetailNoArray(this.saledtailNo);

                        Array.Resize(ref this.saledetailArray, this.saledetailArray.Length + 1);
                        this.saledetailArray[this.saledetailArray.Length - 1] = saleDetail;

                        return;
                    }
                }
            }
            MessageBox.Show("商品が存在しません。");
        }
        
        private void button3_Click(object sender, EventArgs e)
        {
            if (this.saledetailArray.Length == 0)
            {
                MessageBox.Show("販売情報が存在しません。", "エラー");
            }
            else
            {
                Console.WriteLine(productsArray);
                long all = 0;
                foreach (Product product in this.productsArray)
                {
                    for (int i = 0; this.saledetailArray.Length > i; i++)
                    {
                        if (product.GetNo() == this.saledetailArray[i].GetProductNo())
                        {
                            Console.WriteLine(product.GerPrice());
                            all += product.GerPrice() * this.saledetailArray[i].GetQuantity();
                        }
                    }
                }
                label6.Text = String.Format("{0:###0}円", all);
            }
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }
    }
}
