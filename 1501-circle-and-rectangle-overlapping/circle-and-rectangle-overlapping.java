class Solution {
    public boolean checkOverlap(int radius, int xc, int yc, int x1, int y1, int x2, int y2) {
    //     // lets do like what are the cases when they dont intersect ret false
    //     int ctopy = yCenter+radius;
    //     int cbottomy = yCenter-radius;
    //     int crightx = xCenter + radius;
    //     int cleftx = xCenter - radius;
    //     // the rectangle touching any point of circle
    //     // left side check
    //     boolean left=false;
    //     boolean right = false;
    //     boolean top = false;
    //     boolean bottom = false;
    //     for(int i =y1;i<=y2;i++){
    //         if(i>= cbottomy && i<=ctopy){
    //             if(x1>=cleftx && x1<=crightx){left =true;}
    //             if(x2<=crightx && x2>=cleftx){ right = true;}
    //         }

    //     }
    //     for(int i =x1;i<=x2;i++){
    //         if(i<=crightx && i>=cleftx){
    //             if(y2>=cbottomy && y2<=ctopy){ bottom =true;}
    //             if(y1<=ctopy && y1>=cbottomy){ top = true;}
    //         }
    //     }

    // return bottom || left || right|| top;}
    int xi =0,yi=0;
    if(xc<x1){xi=x1;}
    else if(xc>x2){xi = x2;}
    else{ xi = xc;}
    if(yc<y1){yi = y1;}
    else if(yc>y2){yi = y2;}
    else {yi = yc;}
    // int distance = (int)Math.sqrt(Math.pow((xi-xc),2)+Math.pow((yi-yc),2));
    // return distance<=radius;
    int a = xi-xc;
    int b = yi-yc;
    return a*a+b*b<=radius*radius;
    }
}