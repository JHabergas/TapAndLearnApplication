package com.example.asus.alphaapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class TapShowActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,one,two,three,four,five,six,seven,eight,nine,ten;
    MediaPlayer ourSong;
    Button spkAgain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tap_show);

        a=(ImageButton)findViewById(R.id.a);
        b=(ImageButton)findViewById(R.id.b);
        c=(ImageButton)findViewById(R.id.c);
        d=(ImageButton)findViewById(R.id.d);
        e=(ImageButton)findViewById(R.id.e);
        f=(ImageButton)findViewById(R.id.f);
        g=(ImageButton)findViewById(R.id.g);
        h=(ImageButton)findViewById(R.id.h);
        i=(ImageButton)findViewById(R.id.i);
        j=(ImageButton)findViewById(R.id.j);
        k=(ImageButton)findViewById(R.id.k);
        l=(ImageButton)findViewById(R.id.l);
        m=(ImageButton)findViewById(R.id.m);
        n=(ImageButton)findViewById(R.id.n);
        o=(ImageButton)findViewById(R.id.o);
        p=(ImageButton)findViewById(R.id.p);
        q=(ImageButton)findViewById(R.id.q);
        r=(ImageButton)findViewById(R.id.r);
        s=(ImageButton)findViewById(R.id.s);
        t=(ImageButton)findViewById(R.id.t);
        u=(ImageButton)findViewById(R.id.u);
        v=(ImageButton)findViewById(R.id.v);
        w=(ImageButton)findViewById(R.id.w);
        x=(ImageButton)findViewById(R.id.x);
        y=(ImageButton)findViewById(R.id.y);
        z=(ImageButton)findViewById(R.id.z);

        one=(ImageButton)findViewById(R.id.one);
        two=(ImageButton)findViewById(R.id.two);
        three=(ImageButton)findViewById(R.id.three);
        four=(ImageButton)findViewById(R.id.four);
        five=(ImageButton)findViewById(R.id.five);
        six=(ImageButton)findViewById(R.id.six);
        seven=(ImageButton)findViewById(R.id.seven);
        eight=(ImageButton)findViewById(R.id.eight);
        nine=(ImageButton)findViewById(R.id.nine);
        ten=(ImageButton)findViewById(R.id.ten);

        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        e.setOnClickListener(this);
        f.setOnClickListener(this);
        g.setOnClickListener(this);
        h.setOnClickListener(this);
        i.setOnClickListener(this);
        j.setOnClickListener(this);
        k.setOnClickListener(this);
        l.setOnClickListener(this);
        m.setOnClickListener(this);
        n.setOnClickListener(this);
        o.setOnClickListener(this);
        p.setOnClickListener(this);
        q.setOnClickListener(this);
        r.setOnClickListener(this);
        s.setOnClickListener(this);
        t.setOnClickListener(this);
        u.setOnClickListener(this);
        v.setOnClickListener(this);
        w.setOnClickListener(this);
        x.setOnClickListener(this);
        y.setOnClickListener(this);
        z.setOnClickListener(this);

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        ten.setOnClickListener(this);


    }


    public void onClick(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater factory;
        View view;
        ImageView image;
        switch (v.getId()){

            case R.id.a:

                ourSong=MediaPlayer.create(this,R.raw.airplane);
                ourSong.start();
                factory = LayoutInflater.from(TapShowActivity.this);
                view = factory.inflate(R.layout.a, null);
                image = (ImageView) view.findViewById(R.id.ai);
                image.setImageResource(R.drawable.a);
                builder.setNeutralButton("BACK", null);
                builder.setView(view);
                builder.show();
                break;
            case R.id.b:

                ourSong=MediaPlayer.create(this,R.raw.balloon);
                ourSong.start();
                factory = LayoutInflater.from(TapShowActivity.this);
                view = factory.inflate(R.layout.a, null);
                image= (ImageView) view.findViewById(R.id.ai);
                image.setImageResource(R.drawable.b);
                builder.setView(view);
                builder.setNeutralButton("BACK", null);
                builder.show();
                break;
            case R.id.c:

                ourSong=MediaPlayer.create(this,R.raw.caterpillar);
                ourSong.start();
                factory = LayoutInflater.from(TapShowActivity.this);
                view = factory.inflate(R.layout.a, null);
                image= (ImageView) view.findViewById(R.id.ai);
                image.setImageResource(R.drawable.c);
                builder.setView(view);
                builder.setNeutralButton("BACK", null);
                builder.show();
                break;
            case R.id.d:

                ourSong=MediaPlayer.create(this,R.raw.dog);
                ourSong.start();
                factory = LayoutInflater.from(TapShowActivity.this);
                view = factory.inflate(R.layout.a, null);
                image= (ImageView) view.findViewById(R.id.ai);
                image.setImageResource(R.drawable.d);
                builder.setView(view);
                builder.setNeutralButton("BACK", null);
                builder.show();
                break;
            case R.id.e:

                ourSong=MediaPlayer.create(this,R.raw.egg);
                ourSong.start();
                factory = LayoutInflater.from(TapShowActivity.this);
                view = factory.inflate(R.layout.a, null);
                image= (ImageView) view.findViewById(R.id.ai);
                image.setImageResource(R.drawable.e);
                builder.setView(view);
                builder.setNeutralButton("BACK", null);
                builder.show();
                break;
            case R.id.f:

                ourSong=MediaPlayer.create(this,R.raw.friends);
                ourSong.start();
                factory = LayoutInflater.from(TapShowActivity.this);
                view = factory.inflate(R.layout.a, null);
                image= (ImageView) view.findViewById(R.id.ai);
                image.setImageResource(R.drawable.f);
                builder.setView(view);
                builder.setNeutralButton("BACK", null);
                builder.show();
                break;
            case R.id.g:

                ourSong=MediaPlayer.create(this,R.raw.giraffe);
                ourSong.start();
                factory = LayoutInflater.from(TapShowActivity.this);
                view = factory.inflate(R.layout.a, null);
                image= (ImageView) view.findViewById(R.id.ai);
                image.setImageResource(R.drawable.g);
                builder.setView(view);
                builder.setNeutralButton("BACK", null);
                builder.show();
                break;
            case R.id.h:

                ourSong=MediaPlayer.create(this,R.raw.heart);
                ourSong.start();
                factory = LayoutInflater.from(TapShowActivity.this);
                view = factory.inflate(R.layout.a, null);
                image= (ImageView) view.findViewById(R.id.ai);
                image.setImageResource(R.drawable.h);
                builder.setView(view);
                builder.setNeutralButton("BACK", null);
                builder.show();
                break;
            case R.id.i:

                ourSong=MediaPlayer.create(this,R.raw.ice_cream);
                ourSong.start();
                factory = LayoutInflater.from(TapShowActivity.this);
                view = factory.inflate(R.layout.a, null);
                image= (ImageView) view.findViewById(R.id.ai);
                image.setImageResource(R.drawable.i);
                builder.setView(view);
                builder.setNeutralButton("BACK", null);
                builder.show();
                break;
            case R.id.j:

                ourSong=MediaPlayer.create(this,R.raw.jack);
                ourSong.start();
                factory = LayoutInflater.from(TapShowActivity.this);
                view = factory.inflate(R.layout.a, null);
                image= (ImageView) view.findViewById(R.id.ai);
                image.setImageResource(R.drawable.j);
                builder.setView(view);
                builder.setNeutralButton("BACK", null);
                builder.show();
                break;
            case R.id.k:

                ourSong=MediaPlayer.create(this,R.raw.kite);
                ourSong.start();
                factory = LayoutInflater.from(TapShowActivity.this);
                view = factory.inflate(R.layout.a, null);
                image= (ImageView) view.findViewById(R.id.ai);
                image.setImageResource(R.drawable.k);
                builder.setView(view);
                builder.setNeutralButton("BACK", null);
                builder.show();
                break;
            case R.id.l:

                ourSong=MediaPlayer.create(this,R.raw.lion);
                ourSong.start();
                factory = LayoutInflater.from(TapShowActivity.this);
                view = factory.inflate(R.layout.a, null);
                image= (ImageView) view.findViewById(R.id.ai);
                image.setImageResource(R.drawable.l);
                builder.setView(view);
                builder.setNeutralButton("BACK", null);
                builder.show();
                break;
            case R.id.m:

                ourSong=MediaPlayer.create(this,R.raw.music);
                ourSong.start();
                factory = LayoutInflater.from(TapShowActivity.this);
                view = factory.inflate(R.layout.a, null);
                image= (ImageView) view.findViewById(R.id.ai);
                image.setImageResource(R.drawable.m);
                builder.setView(view);
                builder.setNeutralButton("BACK", null);
                builder.show();
                break;
            case R.id.n:

                ourSong=MediaPlayer.create(this,R.raw.numbers);
                ourSong.start();
                factory = LayoutInflater.from(TapShowActivity.this);
                view = factory.inflate(R.layout.a, null);
                image= (ImageView) view.findViewById(R.id.ai);
                image.setImageResource(R.drawable.n);
                builder.setView(view);
                builder.setNeutralButton("BACK", null);
                builder.show();
                break;
            case R.id.o:

                ourSong=MediaPlayer.create(this,R.raw.orbit);
                ourSong.start();
                factory = LayoutInflater.from(TapShowActivity.this);
                view = factory.inflate(R.layout.a, null);
                image= (ImageView) view.findViewById(R.id.ai);
                image.setImageResource(R.drawable.o);
                builder.setView(view);
                builder.setNeutralButton("BACK", null);
                builder.show();
                break;
            case R.id.p:

                ourSong=MediaPlayer.create(this,R.raw.pig);
                ourSong.start();
                factory = LayoutInflater.from(TapShowActivity.this);
                view = factory.inflate(R.layout.a, null);
                image= (ImageView) view.findViewById(R.id.ai);
                image.setImageResource(R.drawable.p);
                builder.setView(view);
                builder.setNeutralButton("BACK", null);
                builder.show();
                break;
            case R.id.q:

                ourSong=MediaPlayer.create(this,R.raw.quack);
                ourSong.start();
                factory = LayoutInflater.from(TapShowActivity.this);
                view = factory.inflate(R.layout.a, null);
                image= (ImageView) view.findViewById(R.id.ai);
                image.setImageResource(R.drawable.q);
                builder.setView(view);
                builder.setNeutralButton("BACK", null);
                builder.show();
                break;
            case R.id.r:

                ourSong=MediaPlayer.create(this,R.raw.rooster);
                ourSong.start();
                factory = LayoutInflater.from(TapShowActivity.this);
                view = factory.inflate(R.layout.a, null);
                image= (ImageView) view.findViewById(R.id.ai);
                image.setImageResource(R.drawable.r);
                builder.setView(view);
                builder.setNeutralButton("BACK", null);
                builder.show();
                break;
            case R.id.s:

                ourSong=MediaPlayer.create(this,R.raw.stars);
                ourSong.start();
                factory = LayoutInflater.from(TapShowActivity.this);
                view = factory.inflate(R.layout.a, null);
                image= (ImageView) view.findViewById(R.id.ai);
                image.setImageResource(R.drawable.s);
                builder.setView(view);
                builder.setNeutralButton("BACK", null);
                builder.show();
                break;
            case R.id.t:

                ourSong=MediaPlayer.create(this,R.raw.turtle);
                ourSong.start();
                factory = LayoutInflater.from(TapShowActivity.this);
                view = factory.inflate(R.layout.a, null);
                image= (ImageView) view.findViewById(R.id.ai);
                image.setImageResource(R.drawable.t);
                builder.setView(view);
                builder.setNeutralButton("BACK", null);
                builder.show();
                break;
            case R.id.u:

                ourSong=MediaPlayer.create(this,R.raw.umbrella);
                ourSong.start();
                factory = LayoutInflater.from(TapShowActivity.this);
                view = factory.inflate(R.layout.a, null);
                image= (ImageView) view.findViewById(R.id.ai);
                image.setImageResource(R.drawable.u);
                builder.setView(view);
                builder.setNeutralButton("BACK", null);
                builder.show();
                break;
            case R.id.v:

                ourSong=MediaPlayer.create(this,R.raw.violin);
                ourSong.start();
                factory = LayoutInflater.from(TapShowActivity.this);
                view = factory.inflate(R.layout.a, null);
                image= (ImageView) view.findViewById(R.id.ai);
                image.setImageResource(R.drawable.v);
                builder.setView(view);
                builder.setNeutralButton("BACK", null);
                builder.show();
                break;
            case R.id.w:

                ourSong=MediaPlayer.create(this,R.raw.whale);
                ourSong.start();
                factory = LayoutInflater.from(TapShowActivity.this);
                view = factory.inflate(R.layout.a, null);
                image= (ImageView) view.findViewById(R.id.ai);
                image.setImageResource(R.drawable.w);
                builder.setView(view);
                builder.setNeutralButton("BACK", null);
                builder.show();
                break;
            case R.id.x:

                ourSong=MediaPlayer.create(this,R.raw.xylophone);
                ourSong.start();
                factory = LayoutInflater.from(TapShowActivity.this);
                view = factory.inflate(R.layout.a, null);
                image= (ImageView) view.findViewById(R.id.ai);
                image.setImageResource(R.drawable.x);
                builder.setView(view);
                builder.setNeutralButton("BACK", null);
                builder.show();
                break;
            case R.id.y:

                ourSong=MediaPlayer.create(this,R.raw.yoyo);
                ourSong.start();
                factory = LayoutInflater.from(TapShowActivity.this);
                view = factory.inflate(R.layout.a, null);
                image= (ImageView) view.findViewById(R.id.ai);
                image.setImageResource(R.drawable.y);
                builder.setView(view);
                builder.setNeutralButton("BACK", null);
                builder.show();
                break;
            case R.id.z:

                ourSong=MediaPlayer.create(this,R.raw.zebra);
                ourSong.start();
                factory = LayoutInflater.from(TapShowActivity.this);
                view = factory.inflate(R.layout.a, null);
                image= (ImageView) view.findViewById(R.id.ai);
                image.setImageResource(R.drawable.z);
                builder.setView(view);
                builder.setNeutralButton("BACK", null);
                builder.show();
                break;

            //numbers

            case R.id.one:

                ourSong=MediaPlayer.create(this,R.raw.a01);
                ourSong.start();
                builder.setTitle("one");
                factory = LayoutInflater.from(TapShowActivity.this);
                view = factory.inflate(R.layout.a, null);
                image= (ImageView) view.findViewById(R.id.ai);
                image.setImageResource(R.drawable.one);
                builder.setView(view);
                builder.setNeutralButton("BACK", null);
                builder.show();
                break;
            case R.id.two:

                ourSong=MediaPlayer.create(this,R.raw.a02);
                ourSong.start();
                builder.setTitle("two");
                factory = LayoutInflater.from(TapShowActivity.this);
                view = factory.inflate(R.layout.a, null);
                image= (ImageView) view.findViewById(R.id.ai);
                image.setImageResource(R.drawable.two);
                builder.setView(view);
                builder.setNeutralButton("BACK", null);
                builder.show();
                break;
            case R.id.three:

                ourSong=MediaPlayer.create(this,R.raw.a03);
                ourSong.start();
                builder.setTitle("three");
                factory = LayoutInflater.from(TapShowActivity.this);
                view = factory.inflate(R.layout.a, null);
                image= (ImageView) view.findViewById(R.id.ai);
                image.setImageResource(R.drawable.three);
                builder.setView(view);
                builder.setNeutralButton("BACK", null);
                builder.show();
                break;
            case R.id.four:

                ourSong=MediaPlayer.create(this,R.raw.a04);
                ourSong.start();
                builder.setTitle("four");
                factory = LayoutInflater.from(TapShowActivity.this);
                view = factory.inflate(R.layout.a, null);
                image= (ImageView) view.findViewById(R.id.ai);
                image.setImageResource(R.drawable.four);
                builder.setView(view);
                builder.setNeutralButton("BACK", null);
                builder.show();
                break;
            case R.id.five:

                ourSong=MediaPlayer.create(this,R.raw.a05);
                ourSong.start();
                builder.setTitle("five");
                factory = LayoutInflater.from(TapShowActivity.this);
                view = factory.inflate(R.layout.a, null);
                image= (ImageView) view.findViewById(R.id.ai);
                image.setImageResource(R.drawable.five);
                builder.setView(view);
                builder.setNeutralButton("BACK", null);
                builder.show();
                break;
            case R.id.six:

                ourSong=MediaPlayer.create(this,R.raw.a06);
                ourSong.start();
                builder.setTitle("six");
                factory = LayoutInflater.from(TapShowActivity.this);
                view = factory.inflate(R.layout.a, null);
                image= (ImageView) view.findViewById(R.id.ai);
                image.setImageResource(R.drawable.six);
                builder.setView(view);
                builder.setNeutralButton("BACK", null);
                builder.show();
                break;
            case R.id.seven:

                ourSong=MediaPlayer.create(this,R.raw.a07);
                ourSong.start();
                builder.setTitle("seven");
                factory = LayoutInflater.from(TapShowActivity.this);
                view = factory.inflate(R.layout.a, null);
                image= (ImageView) view.findViewById(R.id.ai);
                image.setImageResource(R.drawable.seven);
                builder.setView(view);
                builder.setNeutralButton("BACK", null);
                builder.show();
                break;
            case R.id.eight:

                ourSong=MediaPlayer.create(this,R.raw.a08);
                ourSong.start();
                builder.setTitle("eight");
                factory = LayoutInflater.from(TapShowActivity.this);
                view = factory.inflate(R.layout.a, null);
                image= (ImageView) view.findViewById(R.id.ai);
                image.setImageResource(R.drawable.eight);
                builder.setView(view);
                builder.setNeutralButton("BACK", null);
                builder.show();
                break;
            case R.id.nine:

                ourSong=MediaPlayer.create(this,R.raw.a09);
                ourSong.start();
                builder.setTitle("nine");
                factory = LayoutInflater.from(TapShowActivity.this);
                view = factory.inflate(R.layout.a, null);
                image= (ImageView) view.findViewById(R.id.ai);
                image.setImageResource(R.drawable.nine);
                builder.setView(view);
                builder.setNeutralButton("BACK", null);
                builder.show();
                break;
            case R.id.ten:

                ourSong=MediaPlayer.create(this,R.raw.a10);
                ourSong.start();
                builder.setTitle("ten");
                factory = LayoutInflater.from(TapShowActivity.this);
                view = factory.inflate(R.layout.a, null);
                image= (ImageView) view.findViewById(R.id.ai);
                image.setImageResource(R.drawable.ten);
                builder.setView(view);
                builder.setNeutralButton("BACK", null);
                builder.show();
                break;
        }
    }
    @Override
    public void onBackPressed() {
        finish();
    }
}
