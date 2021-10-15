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
        private ProductManager productManager = new ProductManager();
        private SalesManager salesManager = new SalesManager();
        private SalesDetailManager saledDetailManager = new SalesDetailManager();
        
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Product product = new Product();
            long price = Convert.ToInt64(textBox3.Text);

            if (this.productManager.GetAllProduct() != null)
            {
                foreach (var prod in this.productManager.GetAllProduct())
                {
                    if (Convert.ToInt32(textBox1.Text) == prod.Value.GetNo())
                    {
                        MessageBox.Show("既に登録されている商品です。");
                        return;
                    }
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
                //入力OKなんで、Productに情報入れる
                product.SetNo(Convert.ToInt32(textBox1.Text));
                product.SetName(textBox2.Text);
                product.SetPrice(price);

                //ProductManagerに登録したProductを保存する
                this.productManager.SetProduct(product);
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {

            SalesDetail saleDetail = new SalesDetail();
            Sales sales = new Sales(); 

            int quantity = Convert.ToInt32(textBox5.Text);

            //productが登録されてるかを、dictionaryのnull判定で、NULL出ない場合に処理。
            if (this.productManager.GetAllProduct() != null)
            {
                foreach (var product in this.productManager.GetAllProduct())
                {
                    if (product.Key == Convert.ToInt32(textBox4.Text))
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
                                //メソッドとしてまとめて、インスタンス与えてる。
                                setSales(saleDetail);
                                return;
                            }
                        }
                        else
                        {
                            setSales(saleDetail);
                            return;
                        }
                    }
                }
                //商品が存在しな場合、ここにたどり着くまでのロジックが汚いので要修正。
                MessageBox.Show("商品が存在しません。");
            }
        }
        
        private void setSales(SalesDetail saleDetail)
        {
            //saleDetailに情報追加
            saleDetail.SetSaleDetailNo(this.saledDetailManager.GetAllsalesDetail().Count);
            saleDetail.SetProductNo(Convert.ToInt32(textBox4.Text));
            saleDetail.SetQuantity(Convert.ToInt32(textBox5.Text));

            //SaleDetailManagerに情報登録済みのsalesをセット
            this.saledDetailManager.SetSalesDetail(saleDetail);

            //SalesManagerに登録する
            //salesManager.SetSales();
        }
        
        private void button3_Click(object sender, EventArgs e)
        {
            //SaleDetailManagerにsalesインスタンスが格納されているので、そこから個数参照。
            if (this.saledDetailManager.GetAllsalesDetail() == null)
            {
                MessageBox.Show("販売情報が存在しません。", "エラー");
                return;
            }
            else
            {
                long all = 0;
                foreach (var product in this.productManager.GetAllProduct())
                {
                    foreach(var sales in this.saledDetailManager.GetAllsalesDetail())
                    {
                        if (product.Value.GetNo() == sales.Value.GetProductNo())
                        {
                            all += product.Value.GerPrice() * sales.Value.GetQuantity();
                        }
                    }
                }
                label6.Text = String.Format("{0:#,##0}円", all);
            }
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }
    }
}
