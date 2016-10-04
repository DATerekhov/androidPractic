using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;


namespace XamaAndrTest.Objects
{
    public class Club
    {
        private string _name;
        private string _information;

        public Club(string _name, string _information)
        {
            this._name = _name;
            this._information = _information;
        }

        public string Name
        {
            get
            {
                return _name;
            }

            set
            {
                _name = value;
            }
        }

        public string Information
        {
            get
            {
                return _information;
            }

            set
            {
                _information = value;
            }
        }
    }
}