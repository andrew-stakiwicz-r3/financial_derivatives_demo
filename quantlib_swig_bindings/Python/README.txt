
The C++ wrappers for the QuantLib-Python extension module are created
by means of SWIG (Simplified Wrapper and Interface Generator)
available from <http://www.swig.org/>; the latest version is suggested.
Both Python 2.7 and 3.x are supported.

Generating the wrappers is not required if you are using a distributed
tarball. If you're building from a Git checkout, instead, use the
command:

    python setup.py wrap

The commands to be issued for building, testing and installing the
wrappers are:

    python setup.py build
    python setup.py test
    python setup.py install

respectively.

The build step requires that the QuantLib headers and library can be
found by the compiler. On Unix-like platforms, this requires that
`quantlib-config` is in your path. On the Windows platform, instead,
it requires you to define a `QL_DIR` environment variable pointing to
your QuantLib directory (e.g., `C:\Lib\QuantLib`.)

The install step might require superuser privileges.
An alternate install location can be specified with the command:

    python setup.py install --prefix=/home/johndoe

The test suite is implemented on top of the PyUnit framework, which is
included in the Python standard library.




        Date date1m = usdCalendar.advance(valuationDate, per1m); 
        Date date2m = usdCalendar.advance(valuationDate, per2m); 
        Date date3m = usdCalendar.advance(valuationDate, per3m); 
        Date date6m = usdCalendar.advance(valuationDate, per6m);
        Date date1y = usdCalendar.advance(valuationDate, per1y); 
        Date date2y = usdCalendar.advance(valuationDate, per2y); 
        Date date3y = usdCalendar.advance(valuationDate, per3y); 
        Date date5y = usdCalendar.advance(valuationDate, per5y); 
        Date date7y = usdCalendar.advance(valuationDate, per7y); 
        Date date10y = usdCalendar.advance(valuationDate, per10y);
        Date date20y = usdCalendar.advance(valuationDate, per20y); 
        Date date30y = usdCalendar.advance(valuationDate, per30y); 


        periods.add(new Period(1, TimeUnit.Months));
        periods.add(new Period(2, TimeUnit.Months)); 
        Period per3m = new Period(3, TimeUnit.Months); 
        Period per6m = new Period(6, TimeUnit.Months); 
        Period per1y = new Period(1, TimeUnit.Years); 
        Period per2y = new Period(2, TimeUnit.Years);
        Period per3y = new Period(3, TimeUnit.Years);
        Period per5y = new Period(5, TimeUnit.Years); 
        Period per7y = new Period(7, TimeUnit.Years); 
        Period per10y = new Period(10, TimeUnit.Years); 
        Period per20y = new Period(20, TimeUnit.Years);
        Period per30y = new Period(30, TimeUnit.Years); 

        QuoteHandle rate1m = new QuoteHandle(new SimpleQuote(Double.parseDouble(treasuryMap.get("1 MO"))/100));
        QuoteHandle rate2m = new QuoteHandle(new SimpleQuote(Double.parseDouble(treasuryMap.get("2 MO"))/100));
        QuoteHandle rate3m = new QuoteHandle(new SimpleQuote(Double.parseDouble(treasuryMap.get("3 MO"))/100));
        QuoteHandle rate6m = new QuoteHandle(new SimpleQuote(Double.parseDouble(treasuryMap.get("6 MO"))/100));
        QuoteHandle rate1y = new QuoteHandle(new SimpleQuote(Double.parseDouble(treasuryMap.get("1 YR"))/100));
        QuoteHandle rate2y = new QuoteHandle(new SimpleQuote(Double.parseDouble(treasuryMap.get("2 YR"))/100));
        QuoteHandle rate3y = new QuoteHandle(new SimpleQuote(Double.parseDouble(treasuryMap.get("3 YR"))/100));
        QuoteHandle rate5y = new QuoteHandle(new SimpleQuote(Double.parseDouble(treasuryMap.get("5 YR"))/100));
        QuoteHandle rate7y = new QuoteHandle(new SimpleQuote(Double.parseDouble(treasuryMap.get("7 YR"))/100));
        QuoteHandle rate10y = new QuoteHandle(new SimpleQuote(Double.parseDouble(treasuryMap.get("10 YR"))/100));
        QuoteHandle rate20y = new QuoteHandle(new SimpleQuote(Double.parseDouble(treasuryMap.get("20 YR"))/100));
        QuoteHandle rate30y = new QuoteHandle(new SimpleQuote(Double.parseDouble(treasuryMap.get("30 YR"))/100));